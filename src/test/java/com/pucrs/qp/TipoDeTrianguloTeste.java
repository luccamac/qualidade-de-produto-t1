package com.pucrs.qp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoDeTrianguloTeste {

	@Test
	public void test_tipo_de_triangulo() {
		// Given
		int a = 2;
		int b = 3;
		int c = 4;

		// When
		TipoDeTriangulo tipoDeTriangulo = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		assertEquals(tipoDeTriangulo, TipoDeTriangulo.ESCALENO);
	}

}
