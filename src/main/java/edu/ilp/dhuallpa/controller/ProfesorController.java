package edu.ilp.dhuallpa.controller;


import edu.ilp.dhuallpa.entity.Asignatura;
import edu.ilp.dhuallpa.service.Intef.IProfesorServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profesor")
public class ProfesorController {

    @Autowired
    private IProfesorServiceIntef iProfesorServiceIntef;

    @GetMapping( "/listarCursosByProfesor" )
    public List<Asignatura> obtenerCursosDocente(@RequestParam Long idProfesor){
        return iProfesorServiceIntef.obtenerCursoPorProfesor (idProfesor);
    }


}
