package br.com.domsantos.imovel.dto;

import java.io.Serializable;

/**
 * Created by domingos on 28/10/14.
 */
public class ListaCidadePorUF implements Serializable {
    private static final long serialVersionUID = 1436812256244653794L;

    private String estado;

    private String cidade;

    public ListaCidadePorUF(String estado, String cidade) {
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
