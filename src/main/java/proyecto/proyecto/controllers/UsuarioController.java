package proyecto.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.proyecto.dao.UsuarioDao;
import proyecto.proyecto.models.Usuario;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Shirly");
        usuario.setApellido("Hernandez");
        usuario.setEmail("shirly_h@hotmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();

    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuario45")
    public Usuario editar (){
        Usuario usuario = new Usuario();
        usuario.setNombre("Shirly");
        usuario.setApellido("Hernandez");
        usuario.setEmail("shirly_h@hotmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
    public void eliminar (@PathVariable Long id){
        usuarioDao.eliminar(id);

    }

    @RequestMapping(value = "usuario123")
    public Usuario buscar (){
        Usuario usuario = new Usuario();
        usuario.setNombre("Shirly");
        usuario.setApellido("Hernandez");
        usuario.setEmail("shirly_h@hotmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }
}



