Feature: Trabalho 1 - Qualidade de Produto

  Scenario Outline: Combinacoes de Triangulos
    Given that the system receives <a>, <b> and <c> as values for the triangle
    When the system tries to decide which type the triangle is
    Then the system should calculate the triangle as <expected>
    Examples:
      | a | b | c | expected     |
      | 2 | 3 | 4 | "ESCALENO"   |
      | 5 | 5 | 5 | "EQUILATERO" |
      | 6 | 6 | 7 | "ISOSCELES"  |
      | 6 | 7 | 6 | "ISOSCELES"  |
      | 7 | 6 | 6 | "ISOSCELES"  |