package edu.ilp.dhuallpa.service.Impl;

import edu.ilp.dhuallpa.dao.IEstudianteDao;
import edu.ilp.dhuallpa.entity.Estudiante;
import edu.ilp.dhuallpa.service.Intef.IEstudianteServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteServiceIntef {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }
    @Override
    public List<Estudiante> listarEstudiantePorApeNombre(String apenombre) {
        return this.estudianteDao.listarEstudiantesByAppNombre(apenombre);
    }


}
