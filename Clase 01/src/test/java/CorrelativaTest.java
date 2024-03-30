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
            dds = new Materia("disenio"),
            so = new Materia("operativos"),
            arquitectura = new Materia("arquitectura");

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
    void pepitoSeInscribe() {
        pepito.inscribirMateria(dds);
    }

    @BeforeEach
    void correlativasSO() {
        so.addTenerCursada(algoritmos);
        so.addTenerCursada(discreta);
        so.addTenerCursada(arquitectura);
    }

    @Test
    @DisplayName("Correlativas DDS tener cursadas y aprobadas")
    void paraCursarDDSTenerCursadasYAprobadas() {
        assertAll("Correlativas DDS",
                () -> assertEquals(dds.tenerCursadas(), pepito.getMateriaByNombre("disenio").tenerCursadas()),
                () -> assertEquals(dds.tenerAprobadas(), pepito.getMateriaByNombre("disenio").tenerAprobadas())
        );
    }

    @Test
    @DisplayName("Correlativas DDS tener aprobadas")
    void paraCursarDDSTenerAprobadas() {

        assertEquals(dds.tenerAprobadas(), pepito.getMateriaByNombre("disenio").tenerAprobadas());
    }

    @Test
    @DisplayName("No puede cursar SO por que le falta cursar ARQ")
    void tener_cursadas_para_SO() {
        assertFalse(pepito.materiasCursadas().containsAll(so.tenerCursadas()));
    }
}
