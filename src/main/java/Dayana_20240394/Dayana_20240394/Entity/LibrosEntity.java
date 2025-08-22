package Dayana_20240394.Dayana_20240394.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TBUSUARIO")
@Getter @Setter @ToString @EqualsAndHashCode
public class LibrosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario",allocationSize = 1)
    @Column(name = "IDUSUARIO")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "AÑO DE PUBLICACION")
    private String año_publicacion;

    @Column (name = "GENERO")
    private String genero;

    @Column(name = "ID AUTOR")
    private String idAutor;
}
