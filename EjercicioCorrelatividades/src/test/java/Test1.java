import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
//	Alumno
	@BeforeEach
	void contexto(){
		//TODO
	}
    @Test
	@DisplayName("Para cursar DDS")
	void paraCursarDDS() {
		assertEquals(2, 1+1);
	}
	@Test
	@DisplayName("Para cursar SO")
	void paraCursarSO() {
		assertEquals(2, 1+1);
	}
}
