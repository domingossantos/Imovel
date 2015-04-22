package br.com.domsantos.imovel.mb;

import br.com.domsantos.imovel.mb.common.PaginaBean;
import br.com.domsantos.imovel.model.Usuario;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLActions;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by domingos on 22/10/14.
 */
@ManagedBean
@SessionScoped
@URLMappings(mappings = {
        @URLMapping(id = "login", pattern = "/login/", viewId = "/pages/login.jsf"),
        @URLMapping(id = "login2", pattern = "/login", viewId = "/pages/login.jsf")
})
public class LoginBean extends PaginaBean{

    private Usuario usuario;

    @URLActions(actions = {
            @URLAction(mappingId = "login", onPostback = false),
            @URLAction(mappingId = "login2", onPostback = false)
    })
    public void init(){
        usuario = new Usuario();
    }

    public String logar(){
        return "pretty:home";
    }

    public String sair(){
        usuario = null;
        return "pretty:imovel/lista";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
