package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("4", cobertura.fizzBuzz(4));
        assertEquals("FizzBuzz", cobertura.fizzBuzz(15));
        assertEquals("Fizz", cobertura.fizzBuzz(18));
        assertEquals("Buzz", cobertura.fizzBuzz(20));
    }

    @Test
    void testNumeroCombinatorio() {
        assertEquals(1, cobertura.numeroCombinatorio(5, 0));
        assertEquals(1, cobertura.numeroCombinatorio(5, 5));
        assertEquals(0, cobertura.numeroCombinatorio(3, 8));
        assertEquals(21, cobertura.numeroCombinatorio(7, 5));
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertEquals(1, cobertura.repeticionesConsecutivas(new int[] { 1, 2, 3 }));
        assertEquals(4, cobertura.repeticionesConsecutivas(new int[] { 1, 2, 2, 2, 2, 3 }));
    }
}

// assertTrue(debugging.iguales(new int[0], new int[0]));
// assertTrue(debugging.iguales(new int[]{1,2,3},new int[]{1,2,3}));

