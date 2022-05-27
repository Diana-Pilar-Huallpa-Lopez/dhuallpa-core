package edu.ilp.dhuallpa.controller;

import edu.ilp.dhuallpa.entity.Persona;
import edu.ilp.dhuallpa.service.Intef.IPersonaServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("persona")
public class PersonaController {

    @Autowired
    private IPersonaServiceIntef personaServiceIntef;

    @GetMapping("/listarPersona")
    public List<Persona> listarPersona(){
        return  this.personaServiceIntef.listarPersona();
    }
}
