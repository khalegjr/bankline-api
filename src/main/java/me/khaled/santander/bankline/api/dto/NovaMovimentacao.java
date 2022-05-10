package me.khaled.santander.bankline.api.dto;

import me.khaled.santander.bankline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {

  private Integer idConta;
  private String descricao;
  private Double valor;
  private MovimentacaoTipo tipo;

  public Integer getIdConta() {
    return idConta;
  }

  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public MovimentacaoTipo getTipo() {
    return tipo;
  }

  public void setTipo(MovimentacaoTipo tipo) {
    this.tipo = tipo;
  }
}
