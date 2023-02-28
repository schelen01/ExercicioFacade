package Model;

import java.util.Date;

public class Hotel {
    private String nome;
    private String cidade;
    private Date entrada;

    private Date saida;

    public Hotel(String nome, String cidade, Date entrada, Date saida) {
        this.nome = nome;
        this.cidade = cidade;
        this.entrada = entrada;
        this.saida = saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }
}

