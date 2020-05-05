package com.pucrs.qp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.BDDAssertions.then;

public class TrianguloStepDefinitions {

	CombinacaoDeLados combinacaoDeLados;
	TipoDeTriangulo tipoDeTrianguloCalculado;

	@Given("that the system receives {int}, {int} and {int} as values for the triangle")
	public void thatTheSystemReceivesABAndCAsValuesForTheTriangle(int a, int b, int c) {
		combinacaoDeLados = new CombinacaoDeLados(a, b, c, null);
	}

	@When("the system tries to decide which type the triangle is")
	public void theSystemTriesToDecideWhichTypeTheTriangleIs() {
		tipoDeTrianguloCalculado = TipoDeTriangulo.calculaTipo(combinacaoDeLados.getA(), combinacaoDeLados.getB(), combinacaoDeLados.getC());
	}

	@Then("the system should calculate the triangle as {string}")
	public void theSystemShouldCalculateTheTriangleAsExpected(String tipoDeTriangulo) {
		TipoDeTriangulo tipoDeTrianguloEsperado = TipoDeTriangulo.avaliaTipo(tipoDeTriangulo);
		then(tipoDeTrianguloCalculado).isEqualTo(tipoDeTrianguloEsperado);
	}
}
