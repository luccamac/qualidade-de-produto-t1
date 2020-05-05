# T1: Qualidade de Produto [![Build Status](https://travis-ci.com/luccamac/qualidade-de-produto-t1.svg?branch=master)](https://travis-ci.com/luccamac/qualidade-de-produto-t1)

### Stack:
- **Java:** Tecnologia sugerida.
- **JUnit 5 + Parameterized Tests:** Permitem que um teste rode para mais de um valor, possibilitando uma maior flexibilidade para mudanças futuras no código.

_Exemplo extraído da classe de testes._

![JUnit 5](imagens/junit_5.PNG)

- **Cucumber + Scenario Outline:** Testes que utilizam a documentação escrita em Gherkin, facilitando entendimento de pessoas não-TI. Scenario outline permite que, a cada nova linha nos exemplos, seja gerado um cenário a mais na execução dos testes. 

_Imagem extraída dos logs do Travis._

![Cucumber](imagens/cucumber.PNG)


Feature file localizado no projeto.

![Scenario Outline](imagens/scenario_outline.PNG)


- **AssertJ:** Biblioteca que implementa asserções mais "fluentes", nesse caso foi utilizada a versão BDD.
- **Jacoco:** Ao fim dos testes, é gerado um relatório que detalhe a cobertura de testes da aplicação.

_Report gerado fica localizado em `build/reports/jacoco` ao final do build._

![Jacoco](imagens/jacoco.png)

- **Test Logger:** Plugin do gradle que melhora a visibilidade dos testes executados durante o job de "test", no exemplo há um cenário em que é utilizado um teste parametrizado, então é mostrado no console o `toString()` do argumento recebido, além dos títulos de métodos anotados com `@DisplayName`.

_Imagem extraída dos logs do Travis._

![Test Logger](imagens/test_logger.PNG)


