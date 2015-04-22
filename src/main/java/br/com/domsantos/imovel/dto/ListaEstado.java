package br.com.domsantos.imovel.dto;

import java.io.Serializable;

/**
 * Created by domingos on 28/10/14.
 */
public class ListaEstado implements Serializable{
    private static final long serialVersionUID = 1436812256244653794L;

    private String estado;

    public ListaEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
