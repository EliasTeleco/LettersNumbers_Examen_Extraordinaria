package es.ulpgc.eite.cleancode.lettersnumbers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by Luis on junio, 2022
 */
@RunWith(RobolectricTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RobolectricTests {

  RobolectricSteps steps = new RobolectricSteps();



  ////////// PORTRAIT TESTS //////////


  @Test
  public void testCrearPrimeraLetra() { // 1

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos lista de letras con dimension "1"
    steps.mostramosListaDeLetrasConDimensionP1("1");
  }

  @Test
  public void testCrearSegundaLetra() { // 2

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void testPulsarEnSegundaLetra() { // 3

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // When pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }

  @Test
  public void testCrearPrimerNumeroParaSegundaLetra() { // 4

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }

  @Test
  public void testCrearSegundoNumeroParaSegundaLetra() { // 5

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos numero en lista en posicion "1" con valor "2"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
    // And mostramos lista de numeros con dimension "2"
    steps.mostramosListaDeNumerosConDimensionP1("2");
  }

  @Test
  public void testRegresarDesdeSegundoNumeroParaSegundaLetra() { // 6

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void testCrearTercerLetra() { // 7

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void testPulsarEnTerceraLetra() { // 8

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // When pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void testRegresarDesdePrimerNumeroParaTerceraLetra() { // 9

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void testPulsarEnPrimeraLetra() { // 10

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // When pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void testRegresarDesdePrimerNumeroParaPrimeraLetra() { // 11

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  ////////// LANDSCAPE TESTS //////////


  @Test
  public void testCrearPrimeraLetraConRotacion() { // 12

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos lista de letras con dimension "1"
    steps.mostramosListaDeLetrasConDimensionP1("1");
  }

  @Test
  public void testCrearSegundaLetraConRotacion() { // 13

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void testPulsarEnSegundaLetraConRotacion() { // 14

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");
    
    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }

  @Test
  public void testCrearPrimerNumeroParaSegundaLetraConRotacion() { // 15

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }

  @Test
  public void testCrearSegundoNumeroParaSegundaLetraConRotacion() { // 16

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos numero en lista en posicion "1" con valor "2"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
    // And mostramos lista de numeros con dimension "2"
    steps.mostramosListaDeNumerosConDimensionP1("2");
  }

  @Test
  public void testRegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 17

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void testCrearTercerLetraConRotacion() { // 18

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void testPulsarEnTerceraLetraConRotacion() { // 19

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void testRegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 20

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void testPulsarEnPrimeraLetraConRotacion() { // 21

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void testRegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 22

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

}
