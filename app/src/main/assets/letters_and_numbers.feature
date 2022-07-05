Feature: Aplicacion maestro-detalle de numeros y letras

  Scenario: crear primera letra
    Given mostramos lista de letras con dimension "0"
    When pulsamos boton de lista de letras
    Then mostramos letra en lista en posicion "0" con valor "A"
    And mostramos lista de letras con dimension "1"


  Scenario: crear segunda letra
    Given mostramos lista de letras con dimension "0"
    When pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    Then mostramos letra en lista en posicion "0" con valor "A"
    And mostramos letra en lista en posicion "1" con valor "B"
    And mostramos lista de letras con dimension "2"


  Scenario: pulsar en segunda letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    When pulsamos celda de letra en posicion "1"
    Then mostramos lista de numeros con dimension "0"

  Scenario: crear primer numero para segunda letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    When pulsamos boton de lista de numeros
    Then mostramos numero en lista en posicion "0" con valor "1"
    And mostramos lista de numeros con dimension "1"


  Scenario: crear segundo numero para segunda letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    When pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    Then mostramos numero en lista en posicion "0" con valor "1"
    And mostramos numero en lista en posicion "1" con valor "2"
    And mostramos lista de numeros con dimension "2"


  Scenario: regresar desde segundo numero para segunda letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    When pulsamos back en lista de numeros
    Then mostramos letra en lista en posicion "0" con valor "A"
    And mostramos letra en lista en posicion "1" con valor "B"
    And mostramos lista de letras con dimension "2"



  Scenario: crear tercer letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    When pulsamos boton de lista de letras
    Then mostramos letra en lista en posicion "0" con valor "A"
    And mostramos letra en lista en posicion "1" con valor "B"
    And mostramos letra en lista en posicion "2" con valor "C"
    And mostramos lista de letras con dimension "3"


  Scenario: pulsar en tercera letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos boton de lista de letras
    When pulsamos celda de letra en posicion "2"
    Then mostramos lista de numeros con dimension "0"


  Scenario: crear primer numero para tercera letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "2"
    When pulsamos boton de lista de numeros
    Then mostramos numero en lista en posicion "0" con valor "3"
    And mostramos lista de numeros con dimension "1"



  Scenario: regresar desde primer numero para tercera letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "2"
    And pulsamos boton de lista de numeros
    When pulsamos back en lista de numeros
    Then mostramos letra en lista en posicion "0" con valor "A"
    And mostramos letra en lista en posicion "1" con valor "B"
    And mostramos letra en lista en posicion "2" con valor "C"
    And mostramos lista de letras con dimension "3"


  Scenario: pulsar en primera letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "2"
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    When pulsamos celda de letra en posicion "0"
    Then mostramos lista de numeros con dimension "0"


  Scenario: crear primer numero para primera letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "2"
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos celda de letra en posicion "0"
    When pulsamos boton de lista de numeros
    Then mostramos numero en lista en posicion "0" con valor "4"
    And mostramos lista de numeros con dimension "1"



  Scenario: regresar desde primer numero para primera letra
    Given mostramos lista de letras con dimension "0"
    And pulsamos boton de lista de letras
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "1"
    And pulsamos boton de lista de numeros
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos boton de lista de letras
    And pulsamos celda de letra en posicion "2"
    And pulsamos boton de lista de numeros
    And pulsamos back en lista de numeros
    And pulsamos celda de letra en posicion "0"
    And pulsamos boton de lista de numeros
    When pulsamos back en lista de numeros
    Then mostramos letra en lista en posicion "0" con valor "A"
    And mostramos letra en lista en posicion "1" con valor "B"
    And mostramos letra en lista en posicion "2" con valor "C"
    And mostramos lista de letras con dimension "3"