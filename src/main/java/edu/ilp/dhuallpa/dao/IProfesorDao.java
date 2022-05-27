package edu.ilp.dhuallpa.dao;

import edu.ilp.dhuallpa.entity.Asignatura;
import edu.ilp.dhuallpa.entity.Estudiante;
import edu.ilp.dhuallpa.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {

    @Query("SELECT p.asignaturas FROM Profesor p WHERE p.idProfesor = :idProfesor")
    List<Asignatura> obtenerCursoPorProfesor(@Param("idProfesor") Long idProfesor);
}
