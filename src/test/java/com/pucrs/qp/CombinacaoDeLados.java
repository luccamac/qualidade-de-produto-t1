package com.pucrs.qp;

import java.util.Objects;

public class CombinacaoDeLados {
	public CombinacaoDeLados(int a, int b, int c, TipoDeTriangulo tipoDeTrianguloEsperado) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.tipoDeTrianguloEsperado = tipoDeTrianguloEsperado;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public TipoDeTriangulo getTipoDeTrianguloEsperado() {
		return tipoDeTrianguloEsperado;
	}

	public void setTipoDeTrianguloEsperado(TipoDeTriangulo tipoDeTrianguloEsperado) {
		this.tipoDeTrianguloEsperado = tipoDeTrianguloEsperado;
	}

	@Override
	public String toString() {
		return "CombinacaoDeLados{" +
				"a=" + a +
				", b=" + b +
				", c=" + c +
				", tipoDeTrianguloEsperado=" + tipoDeTrianguloEsperado +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CombinacaoDeLados that = (CombinacaoDeLados) o;
		return a == that.a &&
				b == that.b &&
				c == that.c &&
				tipoDeTrianguloEsperado == that.tipoDeTrianguloEsperado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c, tipoDeTrianguloEsperado);
	}

	private int a;
	private int b;
	private int c;
	private TipoDeTriangulo tipoDeTrianguloEsperado;
}
