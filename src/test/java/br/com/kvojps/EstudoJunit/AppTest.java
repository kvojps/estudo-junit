package br.com.kvojps.EstudoJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

	@BeforeAll
	public static void setup() {
		//TODO
		//Executa antes de todos os casos de teste da classe
	}
	
	@AfterAll
	public static void done() {
		//TODO
		//Executa depois de todos os casos de teste
	}
	
	@BeforeEach
	public void init() {
		//TODO
		//Executa antes de cada caso de teste da classe
	}
	
    @DisplayName("Single test sucessful")
	@Test
    public void deveResponderComTrue() {
        assertTrue( true );
    }
    
    @AfterEach
    public void tearDown() {
    	//TODO
    	//Executa depois de cada caso de teste
    }
    
    @Test
    @Disabled("Ainda não implementado")
    public void deveMostrarSimplesAssertion() {
    	Assertions.assertEquals(1, 1);
    }
    
    
    
    @Test
    public void deveValidarTodosItensDaLista() {
    	List<Integer> list = Arrays.asList(2,3,5,7);
    	Assertions.assertAll(() -> assertEquals(1, 1),
    			() -> assertEquals(2, (int) list.get(0)),
    			() -> assertEquals(3, (int) list.get(1)),
    			() -> assertEquals(5, (int) list.get(2)),
    			() -> assertEquals (7, (int) list.get(3)));
//    	Assertions.assertEquals(2, list.get(0));
//    	Assertions.assertEquals(3, list.get(1));
//    	Assertions.assertEquals(5, list.get(2));
//    	Assertions.assertEquals(7, list.get(3));
    }
    
    @Test
    public void deveApenasExecutarTesteSeCriterioForAssumido() {
    	int num = 5;
    	//Executa o teste apenas se a assumption for verdadeira
    	Assumptions.assumeTrue(num > 4);
    	assertEquals(1, 1);
    }
    
    @Test
    public void assertThrowsException() {
        String str = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
          Integer.valueOf(str);
        });
    }
    
}
