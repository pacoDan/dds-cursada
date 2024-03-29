import org.dds.Validador.Alumno;
import org.dds.Validador.Materia;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Correlativa {
    Alumno pepito = new Alumno("Pepito");
    Materia pdep = new Materia("pdep"),
            analisis = new Materia("analisis"),
            algoritmos = new Materia("algoritmos"),
            discreta = new Materia("discreta"),
            dds=new Materia("dds");

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


    @Test
    @DisplayName("Para cursar DDS")
    void paraCursarDDS() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @DisplayName("Para cursar SO")
    void paraCursarSO() {
        assertEquals(2, 1 + 1);
    }
}
