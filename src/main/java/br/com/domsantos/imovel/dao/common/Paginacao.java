package br.com.domsantos.imovel.dao.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by domingos on 25/10/14.
 */
public class Paginacao implements Serializable {

    private static final long serialVersionUID = -3296450971051659001L;

    private Integer pagina;

    private Integer anterior;

    private Integer proxima;

    private Integer quantidadePaginas;

    private Integer total;

    private Integer porPagina;

    private List<Integer> paginas;

    public Paginacao() {
        pagina = 1;
        total = 0;
        porPagina = 20;
        paginas = new ArrayList<Integer>();
    }

    public void calcularPaginas() {
        paginas = new ArrayList<Integer>();

        if(total == 0) return;

        int itensVisiveis = 5;
        int quantidadePaginas = (total / porPagina) + (total % porPagina > 0 ? 1 : 0);

        int inicio = (pagina - 2) < 1 ? 1 : pagina - 2;
        inicio = inicio <= 0 ? 1 : inicio;

        int fim = inicio;
        do {
            paginas.add(fim++);
        } while(fim <= quantidadePaginas && paginas.size() < itensVisiveis);

        anterior = pagina == 1 ? 1 : pagina - 1;
        proxima = pagina == quantidadePaginas ? quantidadePaginas : pagina + 1;
    }

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPorPagina() {
        return porPagina;
    }

    public void setPorPagina(Integer porPagina) {
        this.porPagina = porPagina;
    }

    public List<Integer> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Integer> paginas) {
        this.paginas = paginas;
    }

    public Integer getAnterior() {
        return anterior;
    }

    public void setAnterior(Integer anterior) {
        this.anterior = anterior;
    }

    public Integer getProxima() {
        return proxima;
    }

    public void setProxima(Integer proxima) {
        this.proxima = proxima;
    }

    public Integer getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(Integer quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }
}
