package br.com.domsantos.imovel.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by domingos on 15/10/14.
 */
@Entity
public class Imovel {
    private int idImovel;

    @Id
    @javax.persistence.Column(name = "id_imovel")
    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    private String cep;

    @Basic
    @javax.persistence.Column(name = "cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private String endereco;

    @Basic
    @javax.persistence.Column(name = "endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String bairro;

    @Basic
    @javax.persistence.Column(name = "bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private String cidade;

    @Basic
    @javax.persistence.Column(name = "cidade")
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String estado;

    @Basic
    @javax.persistence.Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String latitude;

    @Basic
    @javax.persistence.Column(name = "latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    private String longitude;

    @Basic
    @javax.persistence.Column(name = "longitude")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    private String caracteristicas;

    @Basic
    @javax.persistence.Column(name = "caracteristicas")
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    private Integer numDormitorio;

    @Basic
    @javax.persistence.Column(name = "num_dormitorio")
    public Integer getNumDormitorio() {
        return numDormitorio;
    }

    public void setNumDormitorio(Integer numDormitorio) {
        this.numDormitorio = numDormitorio;
    }

    private Integer numGaragem;

    @Basic
    @javax.persistence.Column(name = "num_garagem")
    public Integer getNumGaragem() {
        return numGaragem;
    }

    public void setNumGaragem(Integer numGaragem) {
        this.numGaragem = numGaragem;
    }

    private Integer numSuite;

    @Basic
    @javax.persistence.Column(name = "num_suite")
    public Integer getNumSuite() {
        return numSuite;
    }

    public void setNumSuite(Integer numSuite) {
        this.numSuite = numSuite;
    }

    private Double valor;

    @Basic
    @javax.persistence.Column(name = "valor",precision = 2)
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    private String mostrarValor;

    @Basic
    @javax.persistence.Column(name = "mostrar_valor")
    public String getMostrarValor() {
        return mostrarValor;
    }

    public void setMostrarValor(String mostrarValor) {
        this.mostrarValor = mostrarValor;
    }

    private String finalidade;

    @Basic
    @javax.persistence.Column(name = "finalidade")
    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    private String area;

    @Basic
    @javax.persistence.Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Timestamp dataCadastro;

    @Basic
    @javax.persistence.Column(name = "data_cadastro")
    public Timestamp getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    private String parceria;

    @Basic
    @javax.persistence.Column(name = "parceria")
    public String getParceria() {
        return parceria;
    }

    public void setParceria(String parceria) {
        this.parceria = parceria;
    }

    private Timestamp dataNegociacao;

    @Basic
    @javax.persistence.Column(name = "data_negociacao")
    public Timestamp getDataNegociacao() {
        return dataNegociacao;
    }

    public void setDataNegociacao(Timestamp dataNegociacao) {
        this.dataNegociacao = dataNegociacao;
    }

    private String tipo_uso;

    @Basic
    @javax.persistence.Column(name = "tipo_uso")
    public String getTipo_uso() {
        return tipo_uso;
    }

    public void setTipo_uso(String tipo_uso) {
        this.tipo_uso = tipo_uso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imovel imovel = (Imovel) o;

        if (idImovel != imovel.idImovel) return false;
        if (area != null ? !area.equals(imovel.area) : imovel.area != null) return false;
        if (bairro != null ? !bairro.equals(imovel.bairro) : imovel.bairro != null) return false;
        if (caracteristicas != null ? !caracteristicas.equals(imovel.caracteristicas) : imovel.caracteristicas != null)
            return false;
        if (cep != null ? !cep.equals(imovel.cep) : imovel.cep != null) return false;
        if (cidade != null ? !cidade.equals(imovel.cidade) : imovel.cidade != null) return false;
        if (dataCadastro != null ? !dataCadastro.equals(imovel.dataCadastro) : imovel.dataCadastro != null)
            return false;
        if (dataNegociacao != null ? !dataNegociacao.equals(imovel.dataNegociacao) : imovel.dataNegociacao != null)
            return false;
        if (endereco != null ? !endereco.equals(imovel.endereco) : imovel.endereco != null) return false;
        if (estado != null ? !estado.equals(imovel.estado) : imovel.estado != null) return false;
        if (finalidade != null ? !finalidade.equals(imovel.finalidade) : imovel.finalidade != null) return false;
        if (latitude != null ? !latitude.equals(imovel.latitude) : imovel.latitude != null) return false;
        if (longitude != null ? !longitude.equals(imovel.longitude) : imovel.longitude != null) return false;
        if (mostrarValor != null ? !mostrarValor.equals(imovel.mostrarValor) : imovel.mostrarValor != null)
            return false;
        if (numDormitorio != null ? !numDormitorio.equals(imovel.numDormitorio) : imovel.numDormitorio != null)
            return false;
        if (numGaragem != null ? !numGaragem.equals(imovel.numGaragem) : imovel.numGaragem != null) return false;
        if (numSuite != null ? !numSuite.equals(imovel.numSuite) : imovel.numSuite != null) return false;
        if (parceria != null ? !parceria.equals(imovel.parceria) : imovel.parceria != null) return false;
        if (status != null ? !status.equals(imovel.status) : imovel.status != null) return false;
        if (valor != null ? !valor.equals(imovel.valor) : imovel.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idImovel;
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (caracteristicas != null ? caracteristicas.hashCode() : 0);
        result = 31 * result + (numDormitorio != null ? numDormitorio.hashCode() : 0);
        result = 31 * result + (numGaragem != null ? numGaragem.hashCode() : 0);
        result = 31 * result + (numSuite != null ? numSuite.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (mostrarValor != null ? mostrarValor.hashCode() : 0);
        result = 31 * result + (finalidade != null ? finalidade.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (dataCadastro != null ? dataCadastro.hashCode() : 0);
        result = 31 * result + (parceria != null ? parceria.hashCode() : 0);
        result = 31 * result + (dataNegociacao != null ? dataNegociacao.hashCode() : 0);
        return result;
    }
}
