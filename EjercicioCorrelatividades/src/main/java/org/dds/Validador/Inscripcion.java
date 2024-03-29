package org.dds.Validador;

import java.util.*;

/**
 * 
 */
public class Inscripcion {

    /**
     * Default constructor
     */
    public Inscripcion() {
        this.asignaturas = new ArrayList<Materia>();
    }

    /**
     * 
     */
    private List<Materia> asignaturas;

    /**
     * 
     */
    private Alumno alumno;

    /**
     * @return
     */
    public boolean aprobada() {
        // TODO implement here
        return false;
    }

    public void aniadirMateria(Materia m) {
        this.asignaturas.add(m);
    }

    /**
     * @return
     */
    public List<Materia> verMateriasEnIncripcion() {
        // TODO implement here
        return this.asignaturas;
    }

}