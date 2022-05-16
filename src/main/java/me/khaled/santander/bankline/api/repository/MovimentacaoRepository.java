package me.khaled.santander.bankline.api.repository;

import me.khaled.santander.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoRepository
    extends JpaRepository<Movimentacao, Integer> {
    
  public List<Movimentacao> findByIdConta(Integer idConta);
  }
