package org.dds.Validador;

import java.util.*;

/**
 * 
 */
public class Alumno {
    String nombre;
    List<Materia> materiasCursadas,materiasAprobadas;
    public Alumno() {
        materiasCursadas= new ArrayList<Materia>();
        materiasAprobadas= new ArrayList<Materia>();
    }
    public Alumno(String nombre){
        this();
        this.nombre=nombre;
    }
    public String datos;

    /**
     * 
     */
    public List<Materia> materiasAnotadas;

    /**
     * 
     */
    public List<Inscripcion> incripciones;

    /**
     * 
     */
    public Inscripcion inscripcionActual;

    /**
     * @return
     */
    public List<Materia> materiasAnotadas() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Materia> materiasAprobadas() {
        // TODO implement here
        return this.materiasAprobadas;
    }

    /**
     * @return
     */
    public List<Materia> materiasCursadas() {

        return this.materiasCursadas;
    }

    public void incribirMateria(Materia m) {
        // TODO implement here
    }

    public void aniadirCursada(Materia m) {
        this.materiasCursadas().add(m);
    }

    public void aniadirAprobada(Materia materia) {
        this.materiasAprobadas().add(materia);
    }
}