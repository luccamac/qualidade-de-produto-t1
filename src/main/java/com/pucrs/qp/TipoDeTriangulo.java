package com.pucrs.qp;

public enum TipoDeTriangulo {

	EQUILATERO,
	ISOSCELES,
	ESCALENO;

	public static TipoDeTriangulo calculaTipo(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) return null;
		if (a >= b + c || c >= b + a || b >= a + c) return null;
		if (a == b && b == c) return EQUILATERO;
		if (b == c || a == b || c == a) return ISOSCELES;
		return ESCALENO;
	}

}