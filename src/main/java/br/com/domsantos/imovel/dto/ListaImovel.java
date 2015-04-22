package br.com.domsantos.imovel.dto;

import br.com.domsantos.imovel.dao.common.Paginacao;
import br.com.domsantos.imovel.model.Imovel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by domingos on 27/10/14.
 */
public class ListaImovel implements Serializable {
    private static final long serialVersionUID = 1436812256244653794L;

    private Paginacao paginacao;

    private List<Imovel> imoveis;

    public Paginacao getPaginacao() {
        return paginacao;
    }

    public void setPaginacao(Paginacao paginacao) {
        this.paginacao = paginacao;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
}
