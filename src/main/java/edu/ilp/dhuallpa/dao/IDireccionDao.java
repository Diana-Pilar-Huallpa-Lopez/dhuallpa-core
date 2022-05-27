package edu.ilp.dhuallpa.dao;

import edu.ilp.dhuallpa.entity.Direccion;
import edu.ilp.dhuallpa.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccionDao extends CrudRepository<Direccion,Long> {
    @Async
    @Query("SELECT distinct e.direccion  FROM Estudiante e WHERE e.codigo = :codigo")
    Direccion obtenerDireccionPorCodigo(@Param("codigo") String codigo);
}
