package br.com.domsantos.imovel.service;

import br.com.domsantos.imovel.dao.ImovelDAO;
import br.com.domsantos.imovel.dao.common.Paginacao;
import br.com.domsantos.imovel.dto.ListaEstado;
import br.com.domsantos.imovel.model.Imovel;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by domingos on 23/10/14.
 */
@Stateless
public class ImovelSrv {

    @Inject
    private ImovelDAO imovelDAO;


    public List<Imovel> listaImovel(String status,Paginacao paginacao){
        return imovelDAO.listaImoveis(status, paginacao);
    }

    public List<Imovel> pesquisaImovel(String status,String estado,Double faixaInicio, Double faixaFim,Paginacao paginacao){
        return imovelDAO.pesquisaImoveis(status,estado,faixaInicio, faixaFim, paginacao);
    }

    public List<Imovel> listaTodos(){ return imovelDAO.listar(Imovel.class);}

    public List<ListaEstado> listaEstados(){ return imovelDAO.listaEstados();}
}
