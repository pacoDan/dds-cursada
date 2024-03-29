package org.dds.Validador;

import java.util.*;

/**
 *
 */
public class Materia {
    private String nombre;

    private List<Materia> tenerAprobadas;

    private List<Materia> tenerCursadas;

    public Materia() {
        this.tenerCursadas= new ArrayList<Materia>();
        this.tenerAprobadas= new ArrayList<Materia>();
    }

    public Materia(String nombre) {
        this();
        this.nombre=nombre;
    }


    public List<Materia> tenerCursadas() {
        return this.tenerCursadas;
    }

    public List<Materia> tenerAprobadas() {
        return this.tenerAprobadas;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void addTenerAprobada(Materia m) {
        this.tenerAprobadas.add(m);
    }

    public void addTenerCursada(Materia m) {
        this.tenerCursadas.add(m);
    }

    public List<Materia> getCorrelativasCursada() {
        return this.tenerCursadas;
    }
}