package org.dds.Validador;

import java.util.*;
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
    public List<Materia> materiasAnotadas;

    public List<Inscripcion> incripciones;

    public Inscripcion inscripcionActual;

    public List<Materia> materiasAprobadas() {
        return this.materiasAprobadas;
    }
    public List<Materia> materiasCursadas() {

        return this.materiasCursadas;
    }
    public void aniadirCursada(Materia m) {
        this.materiasCursadas().add(m);
    }

    public void aniadirAprobada(Materia materia) {
        this.materiasAprobadas().add(materia);
    }

    public Materia getMateriaByNombre(String materia) {
        var materias = this.inscripcionActual.verMateriasEnIncripcion();
        return materias.stream().findAny().filter(m -> m.getNombre().equals(materia)).orElse(null);
    }
}