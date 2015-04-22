package br.com.domsantos.imovel.ws;

import br.com.domsantos.imovel.dao.common.Paginacao;
import br.com.domsantos.imovel.dto.ListaEstado;
import br.com.domsantos.imovel.dto.ListaImovel;
import br.com.domsantos.imovel.service.ImovelSrv;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Created by domingos on 25/10/14.
 */
@Path("/imovel")
public class ImovelRest {

    @EJB
    private ImovelSrv imovelSrv;

    @QueryParam("pagina") Integer pagina;
    @QueryParam("status") String status;
    @QueryParam("estado") String estado;
    @QueryParam("faixainicio") Double faixaInicio;
    @QueryParam("faixafim") Double faixaFim;


    @GET
    @Path("/lista")
    @Produces("application/json")
    public ListaImovel imovelList(){

        Paginacao paginacao = new Paginacao();
        paginacao.setPagina(pagina);

        ListaImovel listaImovel = new ListaImovel();

        listaImovel.setPaginacao(paginacao);
        listaImovel.setImoveis(imovelSrv.listaImovel(status,paginacao));
        System.out.println("teste");
        return listaImovel;

    }

    @GET
    @Path("/pesquisa")
    @Produces("application/json")
    public ListaImovel imovelFiltroList(){

        Paginacao paginacao = new Paginacao();
        paginacao.setPagina(pagina);

        ListaImovel listaImovel = new ListaImovel();

        listaImovel.setPaginacao(paginacao);
        listaImovel.setImoveis(imovelSrv.pesquisaImovel(status,estado,faixaInicio,faixaFim,paginacao));

        return listaImovel;

    }



    @GET
    @Path("/estados")
    @Produces("application/json")
    public List<ListaEstado> estadoList(){
        return imovelSrv.listaEstados();

    }


}
