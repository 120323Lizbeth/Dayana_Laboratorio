package Dayana_20240394.Dayana_20240394.Controller;

import Dayana_20240394.Dayana_20240394.Services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroService  acceso;

    @GetMapping("/usuario")
    public List<Object> datosUsusraios(){
        return acceso.getAllUsers();
    }
}
