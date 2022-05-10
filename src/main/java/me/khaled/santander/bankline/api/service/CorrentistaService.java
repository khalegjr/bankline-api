package me.khaled.santander.bankline.api.service;

import java.util.Date;
import me.khaled.santander.bankline.api.dto.NovoCorrentista;
import me.khaled.santander.bankline.api.model.Conta;
import me.khaled.santander.bankline.api.model.Correntista;
import me.khaled.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {

  @Autowired
  private CorrentistaRepository repository;

  public void save(NovoCorrentista novoCorrentista) {
    Correntista correntista = new Correntista();

    correntista.setCpf(novoCorrentista.getCpf());
    correntista.setNome(novoCorrentista.getNome());

    Conta conta = new Conta();
    conta.setSaldo(0.00);
    conta.setNumero(new Date().getTime());

    correntista.setConta(conta);

    repository.save(correntista);
  }
}
