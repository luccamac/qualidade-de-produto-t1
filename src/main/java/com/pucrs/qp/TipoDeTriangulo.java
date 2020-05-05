package com.pucrs.qp;

import java.util.Arrays;
import java.util.Optional;

public enum TipoDeTriangulo {

	EQUILATERO("equilatero"),
	ISOSCELES("isosceles"),
	ESCALENO("escaleno");

	public String getNome() {
		return nome;
	}

	private final String nome;

	TipoDeTriangulo(String nome) {
		this.nome = nome;
	}

	public static TipoDeTriangulo calculaTipo(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) throw new CombinacaoInvalida();
		if (a >= b + c || c >= b + a || b >= a + c) throw new CombinacaoInvalida();
		if (a == b && b == c) return EQUILATERO;
		if (b == c || a == b || c == a) return ISOSCELES;
		return ESCALENO;
	}

	public static TipoDeTriangulo avaliaTipo(String nome) {
		Optional<TipoDeTriangulo> tipoDeTriangulo = Arrays.stream(TipoDeTriangulo.values())
				.filter(x -> x.getNome().equalsIgnoreCase(nome))
				.findAny();

		return tipoDeTriangulo.orElse(null);
	}
}