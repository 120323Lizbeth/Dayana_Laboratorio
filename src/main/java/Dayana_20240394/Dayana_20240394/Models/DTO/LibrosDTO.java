package Dayana_20240394.Dayana_20240394.Models.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
@Getter @Setter
public class LibrosDTO {
    private Long id;

    @NotBlank(message = "El titulo del libro es obligatorio")
    private String titulo;

    @NotBlank(message = "El isbn es oblogatorio")
    private String isbn;

    @NotBlank(message = "El año de publicacion es oblogatorio")
    private String año_publicacion;

    @NotBlank(message = "El genero es oblogatorio")
    private String genero;

    @NotBlank(message = "El ID es oblogatorio")
    private String idAutor;
}
