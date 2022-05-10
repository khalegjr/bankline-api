package me.khaled.santander.bankline.api.model;

public class Correntista {
    private Integer id;
    private String cpf;
    private String nome;
    private Conta conta;
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setId(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setId(Conta conta) {
        this.conta = conta;
    }
}
