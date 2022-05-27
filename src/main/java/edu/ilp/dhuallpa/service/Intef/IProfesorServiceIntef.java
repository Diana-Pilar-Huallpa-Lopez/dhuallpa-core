package edu.ilp.dhuallpa.service.Intef;

import edu.ilp.dhuallpa.entity.Asignatura;

import java.util.List;

public interface IProfesorServiceIntef {
    List<Asignatura> obtenerCursoPorProfesor(Long idProfesor);
}
