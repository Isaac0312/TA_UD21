package JUnit.Junit09_Geometria.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class Geometriatest {
	
	Geometria geo;
	
	@BeforeEach
	public void before() {
		System.out.println("Before()");
		geo = new Geometria();
	}
	
	@Test
	void testconstructorid() {
		Geometria aux = new Geometria(3);
		assertEquals("Hecho",3, aux.getId());
		assertEquals("Hecho","Triangulo", aux.getNom());
	}
	
	@Test
	void testconstructorvacio() {
		Geometria aux = new Geometria();
		assertEquals("Hecho",9, aux.getId());
		assertEquals("Hecho","Default", aux.getNom());
	}
	
	@Test
	void testareacuadrado() {
		int resultado = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testareacirculo() {
		double resultado = geo.areaCirculo(2);
		double esperado = 13;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void testareatriangulo() {
		double resultado = geo.areatriangulo(2, 2);
		double esperado = 2;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void testarearectangulo() {
		double resultado = geo.arearectangulo(2, 2);
		double esperado = 4;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void testareapentagono() {
		double resultado = geo.areapentagono(2, 2);
		double esperado = 2;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void testarearombo() {
		double resultado = geo.arearombo(2, 2);
		double esperado = 2;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void testarearomboide() {
		double resultado = geo.arearomboide(2, 2);
		double esperado = 4;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void testareatrapecio() {
		double resultado = geo.areatrapecio(2, 2, 2);
		double esperado = 4;
		int delta = 1;
		assertEquals(esperado, resultado,delta);
	}
	
	@Test
	void teststringfigura() {
		assertTrue(geo.figura(1)=="cuadrado");
		assertTrue(geo.figura(2)=="Circulo");
		assertTrue(geo.figura(3)=="Triangulo");
		assertTrue(geo.figura(4)=="Rectangulo");
		assertTrue(geo.figura(5)=="Pentagono");
		assertTrue(geo.figura(6)=="Rombo");
		assertTrue(geo.figura(7)=="Romboide");
		assertTrue(geo.figura(8)=="Trapecio");
		assertTrue(geo.figura(0)=="Default");
	}
	
	@Test
	void testsetter() {
		geo.setArea(2.2);
		geo.setId(2);
		geo.setNom("Circulo");
		int delta = 1;
		assertEquals(2,geo.getId());
		assertEquals("Circulo",geo.getNom());
		
		assertEquals(2.2,geo.getArea(),delta);
	}
	
	@Test
	void testtostring() {
		Geometria aux = new Geometria(3);
		aux.toString();
		assertEquals("Geometria [id=3, nom=Triangulo, area=0.0]",aux.toString());
	}

}
