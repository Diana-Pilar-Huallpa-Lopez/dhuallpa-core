package edu.ilp.dhuallpa.service.Impl;

import edu.ilp.dhuallpa.dao.IProfesorDao;
import edu.ilp.dhuallpa.entity.Asignatura;
import edu.ilp.dhuallpa.service.Intef.IProfesorServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorServiceIntef {

    @Autowired
    IProfesorDao dao;

    @Override
    public List<Asignatura> obtenerCursoPorProfesor(Long idProfesor)  {
        return this.dao.obtenerCursoPorProfesor (idProfesor);
    }
}
