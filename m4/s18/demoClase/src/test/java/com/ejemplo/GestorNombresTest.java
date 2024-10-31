package com.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
