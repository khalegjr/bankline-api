package me.khaled.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "id_conta")
  private Integer idConta;

  @Column(name = "data_hora")
  private LocalDateTime dataHora;
  private String descricao;
  private Double valor;

  @Enumerated(EnumType.STRING)
  private MovimentacaoTipo tipo;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
      this.id = id;
  }
  
  public Integer getIdConta() {
    return this.idConta;
  }

  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  public LocalDateTime getDataHora() {
    return this.dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return this.valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public MovimentacaoTipo getTipo() {
    return this.tipo;
  }

  public void setTipo(MovimentacaoTipo tipo) {
    this.tipo = tipo;
  }
}
