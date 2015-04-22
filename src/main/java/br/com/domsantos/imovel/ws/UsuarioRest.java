package br.com.domsantos.imovel.ws;

import br.com.domsantos.imovel.model.Usuario;
import br.com.domsantos.imovel.service.UsuarioSrv;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by domingos on 17/10/14.
 */
@Path("/usuario")
public class UsuarioRest {

    @EJB
    private UsuarioSrv usuarioSrv;

    @GET
    @Path("/lista")
    @Produces("application/json")
    public List<Usuario> listaUsuario(){
        try{
            return usuarioSrv.listaUsuarios();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
