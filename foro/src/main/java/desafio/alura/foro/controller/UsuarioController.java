package desafio.alura.foro.controller;



import desafio.alura.foro.model.Usuario;
import desafio.alura.foro.repository.UsuarioRepository;
import desafio.alura.foro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return ResponseEntity.ok(usuarios);  // Retorna la respuesta en formato JSON
    }
    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        // Crear usuario y guardarlo
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    }
}
