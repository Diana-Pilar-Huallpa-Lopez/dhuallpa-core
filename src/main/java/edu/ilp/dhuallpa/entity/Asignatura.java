package edu.ilp.dhuallpa.entity;

import javax.persistence.*;
import java.sql.Time;
@Entity
@Table(name="asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasignatura", length = 30,nullable = false)
    private Long idAsignatura;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "creditos", length = 10)
    private String creditos;

    @Column(name = "sigla", length = 10)
    private String sigla;

    @Column(name = "hteoricas", length = 10)
    private int hTeoricas;

    @Column(name = "hpracticas", length = 10)
    private int hPracticas;

    public Asignatura() {
    }

    public Asignatura(Long idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Asignatura(Long idAsignatura, String denominacion, String creditos, String sigla, int hTeoricas, int hPracticas) {
        this.idAsignatura = idAsignatura;
        this.denominacion = denominacion;
        this.creditos = creditos;
        this.sigla = sigla;
        this.hTeoricas = hTeoricas;
        this.hPracticas = hPracticas;
    }

    public Long getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Long idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int gethTeoricas() {
        return hTeoricas;
    }

    public void sethTeoricas(int hTeoricas) {
        this.hTeoricas = hTeoricas;
    }

    public int gethPracticas() {
        return hPracticas;
    }

    public void sethPracticas(int hPracticas) {
        this.hPracticas = hPracticas;
    }
}
