package com.ejemplo;

import org.example.GestorNombres;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorNombresTest {
	
	//se crea una instancia de la clase a probar
	private GestorNombres gestor;
	
	@BeforeEach
	public void setUp() {
		gestor = new GestorNombres();
	}

	//Test 1: Validar que agregue al ArrayList
	@Test
	public void testAgregarNombre() {
		gestor.agregarNombre("Juan");
		assertTrue(gestor.existeNombre("Juan"), "El nombre 'Juan' deberia existir en la lista");
	}

	//Test 2: Validar que elimine del ArrayList
	@Test
	public void testEliminarNombre() {
		gestor.agregarNombre("Maria");
		gestor.eliminarNombre("Maria");
		assertFalse(gestor.existeNombre("Maria"), "El nombre 'Maria' no deberia existir en la lista");
	}

	//Test 3: Validar canmtidad de elemntos del arrayList
	@Test
	public void testCantidadNombres() {
		gestor.agregarNombre("Francisco");
		gestor.agregarNombre("Valeria");
		assertEquals(2, gestor.cantidadNombres(), "Deberia haber 2 nombres en la lista");
	}
}
