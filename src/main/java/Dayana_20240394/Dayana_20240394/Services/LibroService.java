package Dayana_20240394.Dayana_20240394.Services;

import Dayana_20240394.Dayana_20240394.Entity.LibrosEntity;
import Dayana_20240394.Dayana_20240394.Models.DTO.LibrosDTO;
import Dayana_20240394.Dayana_20240394.Repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    private LibrosRepository repo;
    public List<Object> getAllUsers(){
        List<LibrosEntity> usuarios = repo.findAll();
        return usuarios.stream()
                .map(this::convertirAUsusarioDTO)
                .collect(Collectors.toList());
    }

    private LibrosDTO convertirAUsusarioDTO(LibrosEntity usuario) {
        LibrosDTO dto = new LibrosDTO();
        dto.setId(usuario.getId());
        dto.setTitulo(usuario.getTitulo());
        dto.setIsbn(usuario.getIsbn());
        dto.setAño_publicacion(usuario.getAño_publicacion());
        dto.setGenero(usuario.getGenero());
        dto.setIdAutor(usuario.getIdAutor());
        return dto;
    }

}
