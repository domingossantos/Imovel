package br.com.domsantos.imovel.model;

import javax.persistence.*;

/**
 * Created by domingos on 15/10/14.
 */
@Entity
@Table(name = "foto_imovel", schema = "", catalog = "imovel")
public class FotoImovel {
    private int idFoto;
    private String descricao;
    private String local;

    @Id
    @Column(name = "id_foto")
    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    @Basic
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "local")
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FotoImovel that = (FotoImovel) o;

        if (idFoto != that.idFoto) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (local != null ? !local.equals(that.local) : that.local != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFoto;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (local != null ? local.hashCode() : 0);
        return result;
    }
}
