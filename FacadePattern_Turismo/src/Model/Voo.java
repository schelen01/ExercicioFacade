package Model;

import java.util.Date;

public class Voo {

    private String origem;
    private String destino;
    private Date partida;
    private Date retorno;

    public Voo(String origem, String destino, Date partida, Date retorno) {
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
        this.retorno = retorno;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getPartida() {
        return partida;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }
}
