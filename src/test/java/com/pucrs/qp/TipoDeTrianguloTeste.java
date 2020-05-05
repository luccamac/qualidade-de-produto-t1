package com.pucrs.qp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

public class TipoDeTrianguloTeste {

	@ParameterizedTest
	@DisplayName("Combinações de Triângulos")
	@MethodSource("criaCombinacoes")
	public void test_tipo_de_triangulo(CombinacaoDeLados combinacaoDeLados) {
		// Given
		int a = combinacaoDeLados.getA();
		int b = combinacaoDeLados.getB();
		int c = combinacaoDeLados.getC();
		TipoDeTriangulo tipoDeTrianguloEsperado = combinacaoDeLados.getTipoDeTrianguloEsperado();

		// When
		TipoDeTriangulo tipoDeTrianguloAtual = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		then(tipoDeTrianguloAtual).isEqualTo(tipoDeTrianguloEsperado);
	}

	static Stream<CombinacaoDeLados> criaCombinacoes() {
		List<CombinacaoDeLados> todasCombinacoes = new ArrayList<>();

		List<CombinacaoDeLados> equilatero = criaCombinacoesEquilatero();
		todasCombinacoes.addAll(equilatero);

		List<CombinacaoDeLados> escaleno = criaCombinacoesEscaleno();
		todasCombinacoes.addAll(escaleno);

		List<CombinacaoDeLados> isosceles = criaCombinacoesIsosceles();
		todasCombinacoes.addAll(isosceles);

		return todasCombinacoes.stream();
	}

	private static List<CombinacaoDeLados> criaCombinacoesEscaleno() {
		List<CombinacaoDeLados> combinacoesEscaleno = new ArrayList<>();

		int a = 2;
		int b = 3;
		int c = 4;

		while (combinacoesEscaleno.size() != 15) {
			combinacoesEscaleno.add(
					new CombinacaoDeLados(a, b, c, TipoDeTriangulo.ESCALENO)
			);
			a++;
			b++;
			c++;
		}

		return combinacoesEscaleno;
	}

	private static List<CombinacaoDeLados> criaCombinacoesEquilatero() {
		List<CombinacaoDeLados> combinacoesEquilatero = new ArrayList<>();

		int a = 1;
		int b = 1;
		int c = 1;

		while (combinacoesEquilatero.size() != 15) {
			combinacoesEquilatero.add(
					new CombinacaoDeLados(a, b, c, TipoDeTriangulo.EQUILATERO)
			);
			a++;
			b++;
			c++;
		}

		return combinacoesEquilatero;
	}

	private static List<CombinacaoDeLados> criaCombinacoesIsosceles() {
		List<CombinacaoDeLados> combinacoesIsosceles = new ArrayList<>();

		int a = 1;
		int b = 2;
		int c = 2;

		while (combinacoesIsosceles.size() != 15) {
			combinacoesIsosceles.add(
					new CombinacaoDeLados(a, b, c, TipoDeTriangulo.ISOSCELES)
			);
			a++;
			b++;
			c++;
		}

		return combinacoesIsosceles;
	}

	@Test
	public void valor_zero() {
		// Given
		int a = 8;
		int b = 0;
		int c = 9;

		// When
		TipoDeTriangulo tipoDeTrianguloAtual = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		then(tipoDeTrianguloAtual).isNull();
	}

	@Test
	public void todos_zero() {
		// Given
		int a = 0;
		int b = 0;
		int c = 0;

		// When
		TipoDeTriangulo tipoDeTrianguloAtual = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		then(tipoDeTrianguloAtual).isNull();
	}

	@Test
	public void valor_menor_que_zero() {
		// Given
		int a = -8;
		int b = 0;
		int c = 9;

		// When
		TipoDeTriangulo tipoDeTrianguloAtual = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		then(tipoDeTrianguloAtual).isNull();
	}

	@Test
	public void linha_longa() {
		// Given
		int a = 1;
		int b = 2;
		int c = 8;

		// When
		TipoDeTriangulo tipoDeTrianguloAtual = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		then(tipoDeTrianguloAtual).isNull();
	}

	@Test
	public void numeros_reais() {
		// Given
		int a = 1 / 2;
		int b = 3 / 4;
		int c = 5;

		// When
		TipoDeTriangulo tipoDeTrianguloAtual = TipoDeTriangulo.calculaTipo(a, b, c);

		// Then
		then(tipoDeTrianguloAtual).isNull();
	}

}
