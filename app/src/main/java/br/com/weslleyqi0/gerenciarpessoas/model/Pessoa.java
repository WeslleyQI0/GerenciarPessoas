package br.com.weslleyqi0.gerenciarpessoas.model;

import java.io.Serializable;

/**
 * Created by Weslley on 01/04/2017.
 */

public class Pessoa implements Serializable {

    String PrimeiroNome;
    String segunndoNome;
    String ultimoNome;
    String imgFoto;

    public Pessoa() {
    }

    public Pessoa(String primeiroNome, String segunndoNome, String ultimoNome, String imgFoto) {
        PrimeiroNome = primeiroNome;
        this.segunndoNome = segunndoNome;
        this.ultimoNome = ultimoNome;
        this.imgFoto = imgFoto;
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        PrimeiroNome = primeiroNome;
    }

    public String getSegunndoNome() {
        return segunndoNome;
    }

    public void setSegunndoNome(String segunndoNome) {
        this.segunndoNome = segunndoNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(String imgFoto) {
        this.imgFoto = imgFoto;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "PrimeiroNome='" + PrimeiroNome + '\'' +
                ", segunndoNome='" + segunndoNome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", imgFoto='" + imgFoto + '\'' +
                '}';
    }
}
