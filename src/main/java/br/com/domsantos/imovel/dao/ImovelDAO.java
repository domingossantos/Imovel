package br.com.domsantos.imovel.dao;

import br.com.domsantos.imovel.dao.common.DAO;
import br.com.domsantos.imovel.dao.common.Paginacao;
import br.com.domsantos.imovel.dto.ListaEstado;
import br.com.domsantos.imovel.model.Imovel;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by domingos on 16/10/14.
 */
public class ImovelDAO extends DAO<Imovel>{

    public List<Imovel> listaImoveis(String status, Paginacao paginacao){

        Query queryCount = createQuery("select count(i) from Imovel i where i.status = :status ");
        Query queryDados = createQuery("select i from Imovel i where i.status = :status order by i.dataCadastro");

        queryCount.setParameter("status",status);
        queryDados.setParameter("status",status);

        int count = ((Long) queryCount.getSingleResult()).intValue();

        paginacao.setTotal(count);
        paginacao.calcularPaginas();

        queryDados.setFirstResult(paginacao.getPagina() != 1 ? paginacao.getPorPagina() * (paginacao.getPagina() -1) : 0);
        queryDados.setMaxResults(paginacao.getPorPagina());

        return queryDados.getResultList();
    }

    public List<Imovel> pesquisaImoveis(String status,String estado, Double faixaInicio, Double faixaFim, Paginacao paginacao){

        Query queryCount = createQuery("select count(i) from Imovel i where i.status = :status " +
                                       " and i.estado = :estado and i.valor between :faixaInicio and :faixaFim");
        Query queryDados = createQuery("select i from Imovel i where i.status = :status " +
                                       " and i.estado = :estado and i.valor between :faixaInicio and :faixaFim " +
                                       " order by i.dataCadastro");

        queryCount.setParameter("status",status);
        queryCount.setParameter("estado",estado);
        queryCount.setParameter("faixaInicio",faixaInicio);
        queryCount.setParameter("faixaFim",faixaFim);

        queryDados.setParameter("status",status);
        queryDados.setParameter("estado",estado);
        queryDados.setParameter("faixaInicio",faixaInicio);
        queryDados.setParameter("faixaFim",faixaFim);

        int count = ((Long) queryCount.getSingleResult()).intValue();

        paginacao.setTotal(count);
        paginacao.calcularPaginas();

        queryDados.setFirstResult(paginacao.getPagina() != 1 ? paginacao.getPorPagina() * (paginacao.getPagina() -1) : 0);
        queryDados.setMaxResults(paginacao.getPorPagina());

        return queryDados.getResultList();
    }



    public List<ListaEstado> listaEstados(){
        Query queryDados = createQuery("select distinct i.estado from Imovel i ");

        return queryDados.getResultList();
    }


}
