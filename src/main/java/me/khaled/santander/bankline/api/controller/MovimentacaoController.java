package me.khaled.santander.bankline.api.controller;

import java.util.List;
import me.khaled.santander.bankline.api.dto.NovaMovimentacao;
import me.khaled.santander.bankline.api.model.Movimentacao;
import me.khaled.santander.bankline.api.repository.MovimentacaoRepository;
import me.khaled.santander.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

  @Autowired
  private MovimentacaoRepository repository;

  @Autowired
  private MovimentacaoService service;

  @GetMapping
  public List<Movimentacao> findAll() {
    return repository.findAll();
  }

  @PostMapping
  public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
    service.save(novaMovimentacao);
  }
}
