package br.com.domsantos.imovel.mb.imovel;

import br.com.domsantos.imovel.dao.common.Paginacao;
import br.com.domsantos.imovel.mb.common.PaginaBean;
import br.com.domsantos.imovel.model.Imovel;
import br.com.domsantos.imovel.service.ImovelSrv;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by domingos on 23/10/14.
 */
@ManagedBean
@ViewScoped
@URLMappings(mappings = {
        @URLMapping(id = "imovelLista", pattern = "/imovel/lista/", viewId = "/pages/imovel/imovel_lista.jsf"),
        @URLMapping(id = "imovelLista2", pattern = "/imovel/lista", viewId = "/pages/imovel/imovel_lista.jsf")
})
public class ImovelGridBean extends PaginaBean{

    @EJB
    private ImovelSrv imovelSrv;

    private Imovel imovel;

    private List<Imovel> imovelList;

    private Integer pagina;

    private String status;

    private Paginacao paginacao;

    /*@URLActions(actions = {
            @URLAction(mappingId = "imovelLista", onPostback = false),
            @URLAction(mappingId = "imovelLista2", onPostback = false)
    })
    public void abrir(){
        paginacao = new Paginacao();

        if(pagina == null){
            pagina = 1;
        }

        paginacao.setPagina(pagina);

        status = "A";
        imovelList = imovelSrv.listaImovel(status, paginacao);
    }*/


    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public List<Imovel> getImovelList() {
        return imovelList;
    }

    public void setImovelList(List<Imovel> imovelList) {
        this.imovelList = imovelList;
    }

    public Paginacao getPaginacao() {
        return paginacao;
    }

    public void setPaginacao(Paginacao paginacao) {
        this.paginacao = paginacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
