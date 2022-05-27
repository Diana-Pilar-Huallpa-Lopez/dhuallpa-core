package edu.ilp.dhuallpa.dao;

import edu.ilp.dhuallpa.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
