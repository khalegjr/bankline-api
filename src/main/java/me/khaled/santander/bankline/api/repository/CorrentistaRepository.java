package me.khaled.santander.bankline.api.repository;

import me.khaled.santander.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository
  extends JpaRepository<Correntista, Integer> {}
