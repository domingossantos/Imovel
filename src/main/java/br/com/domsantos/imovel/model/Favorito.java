package br.com.domsantos.imovel.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by domingos on 15/10/14.
 */
@Entity
public class Favorito {
    private int idFavorito;
    private Timestamp data;

    @Id
    @Column(name = "id_favorito")
    public int getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(int idFavorito) {
        this.idFavorito = idFavorito;
    }

    @Basic
    @Column(name = "data")
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Favorito favorito = (Favorito) o;

        if (idFavorito != favorito.idFavorito) return false;
        if (data != null ? !data.equals(favorito.data) : favorito.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFavorito;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
