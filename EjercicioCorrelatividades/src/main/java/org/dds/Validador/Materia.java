package org.dds.Validador;

import java.util.*;

/**
 *
 */
public class Materia {
    String nombre;

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
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Materia> tenerAprobadas() {
        // TODO implement here
        return null;
    }

    public void addTenerAprobada(Materia m) {
        this.tenerAprobadas.add(m);
    }

    public void addTenerCursada(Materia m) {
        this.tenerCursadas.add(m);
    }
}