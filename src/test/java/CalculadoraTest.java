// import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculadoraTest {

    @Nested
    @DisplayName("Probando metodo suma")
    class sumaFeature {
        Calculadora calculadora;

        @BeforeEach
        void createIntance() {
            this.calculadora = new Calculadora();
        }

        @Test
        @DisplayName("cuando retorna de forma acertada")
        void sumaExitosa() {
            float resultadoEsperado = 9;
            float resultadoNoEsperado = 3;

            float resultado = calculadora.suma(6,3);

            Assertions.assertEquals(resultadoEsperado, resultado);
            Assertions.assertNotEquals(resultadoNoEsperado, resultado);
        }
    }

}