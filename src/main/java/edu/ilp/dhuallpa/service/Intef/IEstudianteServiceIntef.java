package edu.ilp.dhuallpa.service.Intef;

import edu.ilp.dhuallpa.entity.Estudiante;

import java.util.List;

public interface IEstudianteServiceIntef {
    Estudiante obtenerEstudiantePorCodigo(String codigo);

    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);
}
