package br.com.domsantos.imovel.service;

import br.com.domsantos.imovel.dao.UsuarioDAO;
import br.com.domsantos.imovel.model.Usuario;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by domingos on 17/10/14.
 */
@Stateless
public class UsuarioSrv {

    @Inject
    private UsuarioDAO usuarioDAO;

    public UsuarioSrv() {
    }

    public List<Usuario> listaUsuarios(){
        return usuarioDAO.listar(Usuario.class);
    }
}
