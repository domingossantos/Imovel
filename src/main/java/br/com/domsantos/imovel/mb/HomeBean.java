package br.com.domsantos.imovel.mb;

import br.com.domsantos.imovel.mb.common.PaginaBean;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLActions;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by domingos on 18/10/14.
 */
@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "home", pattern = "/home/", viewId = "/pages/home.jsf"),
    @URLMapping(id = "home2", pattern = "/home", viewId = "/pages/home.jsf")
})
public class HomeBean extends PaginaBean{


    @URLActions(actions = {
        @URLAction(mappingId = "home", onPostback = false),
        @URLAction(mappingId = "home2", onPostback = false)
    })
    public void abrir(){
        System.out.print("Aqui!");
    }

}
