package br.com.domsantos.imovel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by domingos on 15/10/14.
 */
@Entity
@Table(name = "equipamento_imovel", schema = "", catalog = "imovel")
public class EquipamentoImovel {
    private int idEquipamentoImovel;

    @Id
    @Column(name = "id_equipamento_imovel")
    public int getIdEquipamentoImovel() {
        return idEquipamentoImovel;
    }

    public void setIdEquipamentoImovel(int idEquipamentoImovel) {
        this.idEquipamentoImovel = idEquipamentoImovel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipamentoImovel that = (EquipamentoImovel) o;

        if (idEquipamentoImovel != that.idEquipamentoImovel) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idEquipamentoImovel;
    }
}
