package edu.ilp.dhuallpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 100, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 100, nullable = false)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idPersona, String codigo, String serie) {
        super (idPersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idPersona, String nombre,String apellido, String telefono, String email, Direccion direccion, String codigo, String serie) {
        super (idPersona, nombre,apellido, telefono, email, direccion);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

}
