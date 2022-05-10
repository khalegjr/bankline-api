package me.khaled.santander.bankline.api.repository;

import me.khaled.santander.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository
  extends JpaRepository<Movimentacao, Integer> {}
