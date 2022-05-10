package me.khaled.santander.bankline.api.service;

import java.time.LocalDateTime;
import me.khaled.santander.bankline.api.dto.NovaMovimentacao;
import me.khaled.santander.bankline.api.model.Correntista;
import me.khaled.santander.bankline.api.model.Movimentacao;
import me.khaled.santander.bankline.api.model.MovimentacaoTipo;
import me.khaled.santander.bankline.api.repository.CorrentistaRepository;
import me.khaled.santander.bankline.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {

  @Autowired
  private MovimentacaoRepository repository;

  @Autowired
  private CorrentistaRepository correntistaRepository;

  public void save(NovaMovimentacao novaMovimentacao) {
    Double valor = novaMovimentacao.getTipo() == MovimentacaoTipo.RECEITA
      ? novaMovimentacao.getValor()
      : novaMovimentacao.getValor() * -1;

    Movimentacao movimentacao = new Movimentacao();
    movimentacao.setDataHora(LocalDateTime.now());
    movimentacao.setDescricao(novaMovimentacao.getDescricao());
    movimentacao.setIdConta(novaMovimentacao.getIdConta());
    movimentacao.setTipo(novaMovimentacao.getTipo());
    movimentacao.setValor(valor);

    Correntista correntista = correntistaRepository
      .findById(novaMovimentacao.getIdConta())
      .orElse(null);

    if (correntista != null) {
      correntista
        .getConta()
        .setSaldo(correntista.getConta().getSaldo() + valor);
      correntistaRepository.save(correntista);
    }

    repository.save(movimentacao);
  }
}
