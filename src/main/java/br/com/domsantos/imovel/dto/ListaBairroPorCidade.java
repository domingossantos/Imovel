package br.com.domsantos.imovel.dto;

import java.io.Serializable;

/**
 * Created by domingos on 28/10/14.
 */
public class ListaBairroPorCidade implements Serializable {
    private static final long serialVersionUID = 1436812256244653794L;

    private String cidade;
    private String bairro;

    public ListaBairroPorCidade(String cidade, String bairro) {
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
