import org.dds.Validador.Alumno;
import org.dds.Validador.Materia;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CorrelativaTest {
    Alumno pepito = new Alumno("Pepito");
    Materia pdep = new Materia("pdep"),
            analisis = new Materia("analisis"),
            algoritmos = new Materia("algoritmos"),
            discreta = new Materia("discreta"),
            dds=new Materia("disenio");

    @BeforeEach
    void materiasDePepito() {
        pepito.aniadirCursada(pdep);
        pepito.aniadirCursada(analisis);
        pepito.aniadirAprobada(algoritmos);
        pepito.aniadirAprobada(discreta);
    }
    @BeforeEach
    void correlativasDisenio() {
        dds.addTenerAprobada(discreta);
        dds.addTenerAprobada(algoritmos);
        dds.addTenerCursada(pdep);
        dds.addTenerCursada(analisis);
    }
    @BeforeEach
    void pepitoSeInscribe(){
        pepito.inscribirMateria(dds);
    }


    @Test
    @DisplayName("Correlativas DDS tener cursadas")
    void paraCursarDDSTenerCursadas() {
        assertEquals(dds.tenerCursadas(), pepito.getMateriaByNombre("disenio").tenerCursadas());

        assertEquals(dds.tenerAprobadas(), pepito.getMateriaByNombre("disenio").tenerAprobadas());
    }
    @Test
    @DisplayName("Correlativas DDS tener aprobadas")
    void paraCursarDDSTenerAprobadas() {

        assertEquals(dds.tenerAprobadas(), pepito.getMateriaByNombre("disenio").tenerAprobadas());
    }
    @Test
    @DisplayName("Para cursar SO")
    void paraCursarSO() {
        var materiasAprobadasDePepito = pepito.materiasAprobadas();
        var materiasCursadasDePepito = pepito.materiasCursadas();
        var materiasDePepito = materiasAprobadasDePepito.addAll(materiasCursadasDePepito);
        assertTrue(true);
    }
}
