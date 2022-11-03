package Proyecto_Calculadora.Proyecto_Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculadoratest {
	
	Calculadora calc;
	
	@BeforeEach
	public void before() {
		System.out.println("Before()");
		calc = new Calculadora();
	}
	
	@Test
	void testconstructorid() {
		Calculadora aux = new Calculadora(1,1);
		assertEquals(1, aux.getOperador1());
		assertEquals(1, aux.getOperador2());
	}
	
	@Test
	void testconstructorvacio() {
		Calculadora aux = new Calculadora();
		assertEquals(0, aux.getOperador1());
		assertEquals(0, aux.getOperador2());

	}
	
	@Test
	void testsuma() {
		calc.setOperador1(1);
		calc.setOperador2(1);
		int resultado = calc.suma();
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testresta() {
		calc.setOperador1(1);
		calc.setOperador2(1);
		int resultado = calc.resta();
		int esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testmultiplicacio() {
		calc.setOperador1(1);
		calc.setOperador2(5);
		int resultado = calc.multiplicacio();
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testdivisio() {
		calc.setOperador1(1);
		calc.setOperador2(1);
		int resultado = calc.suma();
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	
	@Test
	void testoperacio() {
		calc.setOperador1(5);
		calc.setOperador2(5);
        calc.setOperacio(1);
		assertTrue(calc.operacio()==10);
		calc.setOperacio(2);
		assertTrue(calc.operacio()==0);
		calc.setOperacio(3);
		assertTrue(calc.operacio()==25);
		calc.setOperacio(4);
		assertTrue(calc.operacio()==1);
	}
	
	@Test
	void testsetter() {
		calc.setOperacio(1);
		calc.setOperador1(1);
		calc.setOperador2(1);
		assertEquals(1,calc.getOperacio());
		assertEquals(1,calc.getOperador1());
		assertEquals(1,calc.getOperador2());
	}

}
