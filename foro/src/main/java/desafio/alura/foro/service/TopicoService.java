package desafio.alura.foro.service;


import desafio.alura.foro.model.Topico;
import desafio.alura.foro.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico registrarTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    public void eliminarTopico(Long id) {
        topicoRepository.deleteById(id);
    }

    public Topico actualizarTopico(Topico topico) {
        return topicoRepository.save(topico);
    }
}
