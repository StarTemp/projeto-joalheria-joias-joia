package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.services.TipoUsuarioService;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
	
    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @PostMapping
    public TipoUsuario createTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }

    @GetMapping
    public List<TipoUsuario> getAllTipoUsuario() {
        return tipoUsuarioService.getAllTipoUsuario();
    }

    @GetMapping("/{id}")
    public TipoUsuario getTipoUsuario(@PathVariable Long id) {
        return tipoUsuarioService.getTipoUsuarioById(id);
    }

    @PutMapping
    public TipoUsuario editTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoUsuario(@PathVariable Long id) {
        tipoUsuarioService.deleteTipoUsuario(id);
    }
}
