package br.com.kvojps.EstudoJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class AppTest {

    @Test
    public void deveResponderComTrue() {
        assertTrue( true );
    }
    
    @Test
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
    
}
