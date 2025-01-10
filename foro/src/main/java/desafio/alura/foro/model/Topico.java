package desafio.alura.foro.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;

    @ManyToOne
    private Usuario usuario;
}

