package org.dds.Validador;

import java.util.*;

/**
 * 
 */
public class Inscripcion {
    public Inscripcion(Alumno alumno) {
        this.asignaturas = new ArrayList<Materia>();
        this.alumno=alumno;
        alumno.inscripcionActual=this;
    }

    private List<Materia> asignaturas;
    private Alumno alumno;
    public boolean aprobada() {
        return this.asignaturas.stream().allMatch(materia->this.cumpleCorrelativa(materia));
    }

    private boolean cumpleCorrelativa(Materia materia) {
        var cumpleCursadas= this.alumno.materiasCursadas().containsAll(materia.getCorrelativasCursada());
        var cumpleAprobadas= this.alumno.materiasAprobadas().containsAll(materia.getCorrelativasAprobadas());
        return cumpleCursadas && cumpleAprobadas;
    }

    public void aniadirMateria(Materia m) {
        this.asignaturas.add(m);
    }

    public List<Materia> verMateriasEnIncripcion() {
        // TODO implement here
        return this.asignaturas;
    }

    public void inscribirMateria(Materia m) {
//        this.alumno.inscribirMateria(m);
        this.asignaturas.add(m);
    }
}