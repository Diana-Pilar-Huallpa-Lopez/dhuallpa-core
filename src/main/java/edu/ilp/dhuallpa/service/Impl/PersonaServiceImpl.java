package edu.ilp.dhuallpa.service.Impl;


import edu.ilp.dhuallpa.dao.IPersonaDao;
import edu.ilp.dhuallpa.entity.Persona;
import edu.ilp.dhuallpa.service.Intef.IPersonaServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaServiceIntef {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }
}
