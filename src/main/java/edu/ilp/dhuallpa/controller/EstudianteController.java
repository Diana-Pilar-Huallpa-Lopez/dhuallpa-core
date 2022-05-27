package edu.ilp.dhuallpa.controller;

import edu.ilp.dhuallpa.dao.IEstudianteDao;
import edu.ilp.dhuallpa.entity.Direccion;
import edu.ilp.dhuallpa.entity.Estudiante;
import edu.ilp.dhuallpa.service.Intef.IDireccionServiceIntef;
import edu.ilp.dhuallpa.service.Intef.IEstudianteServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("estudiante")
public class EstudianteController {
    @Autowired
    private IEstudianteServiceIntef estudianteService;


    //Buscar un estudiante por su código
    @GetMapping( "/buscarEstudianteBycodigo" )
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo (codigo);
    }

    @GetMapping("/listarByAppnombre/{appnombre}")
    public List<Estudiante> listarPorApellidoNombre(@PathVariable String appnombre){
        return this.estudianteService.listarEstudiantePorApeNombre(appnombre);
    }


}