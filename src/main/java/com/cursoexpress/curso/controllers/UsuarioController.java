package com.cursoexpress.curso.controllers;

import com.cursoexpress.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Harry");
        usuario.setApellido("Alvarado");
        usuario.setEmail("micorreo@email.com");
        usuario.setTelefono("+50761213412");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Harry");
        usuario.setApellido("Alvarado");
        usuario.setEmail("micorreo@email.com");
        usuario.setTelefono("+50761213412");
        return usuario;
    }

    @RequestMapping(value = "usuario321")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Harry");
        usuario.setApellido("Alvarado");
        usuario.setEmail("micorreo@email.com");
        usuario.setTelefono("+50761213412");
        return usuario;
    }

    @RequestMapping(value = "usuario3123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Harry");
        usuario.setApellido("Alvarado");
        usuario.setEmail("micorreo@email.com");
        usuario.setTelefono("+50761213412");
        return usuario;
    }
}
