package desafio.alura.foro.controller;



import desafio.alura.foro.model.Topico;
import desafio.alura.foro.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public Topico registrarTopico(@RequestBody Topico topico) {
        return topicoService.registrarTopico(topico);
    }

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoService.listarTopicos();
    }

    @DeleteMapping("/{id}")
    public void eliminarTopico(@PathVariable Long id) {
        topicoService.eliminarTopico(id);
    }

    @PutMapping
    public Topico actualizarTopico(@RequestBody Topico topico) {
        return topicoService.actualizarTopico(topico);
    }
}
