package br.com.domsantos.imovel.model;

import javax.persistence.*;

/**
 * Created by domingos on 15/10/14.
 */
@Entity
@Table(name = "tipo_imovel", schema = "", catalog = "imovel")
public class TipoImovel {
    private int idTipoImovel;
    private String descricao;

    @Id
    @Column(name = "id_tipo_imovel")
    public int getIdTipoImovel() {
        return idTipoImovel;
    }

    public void setIdTipoImovel(int idTipoImovel) {
        this.idTipoImovel = idTipoImovel;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoImovel that = (TipoImovel) o;

        if (idTipoImovel != that.idTipoImovel) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoImovel;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        return result;
    }
}
