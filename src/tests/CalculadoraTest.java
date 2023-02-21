package tests;

import clases.Calculadora;
import org.junit.*;

public class CalculadoraTest {

    //Atributos

    Calculadora calc;

    //la anotacion @BeforeTest, permite realizar acciones antes que se ejecute la prueba (pre condiciones)
    @Before

    public void preCondiciones(){

        System.out.println("Preparacion de la prueba");

        //se instancia el objeto
        calc = new Calculadora();
    }

    //La anotacion before class permite realizar acciones antes de que se ejecute le primer metodo de la clase
    @BeforeClass

    public static void inicioPruebas(){

        System.out.println("Inicio de pruebas unitarias");
        System.out.println("Preparando ejecucion...");
        System.out.println("----------------------------");

    }

    //La anotacion after class permite realizar acciones antes de que se ejecute le primer metodo de la clase
    @AfterClass

    public static void finPruebas(){

        System.out.println("----------------------------");
        System.out.println("Fin de pruebas unitarias");


    }

    //la anotacion @After, permite permite realizar acciones despues de que se ejecute la prueba (pos condiciones)
    @After

    public void posCondiciones(){

        System.out.println("PosCondiciones de la prueba");



    }

    //la anotacion @Test, describe que el metodo que se escriba abajo es una prueba
    @Test

    public void sumarTest(){

        System.out.println("Ejecucion de prueba sumar");
        Assert.assertEquals(6,calc.sumar(3,3));

    }

    @Test

    public void restarTest(){

        System.out.println("Ejecucion de prueba restar");
        Assert.assertEquals(6,calc.restar(12,6));

    }

    @Test

    public void multiplicarTest(){

        System.out.println("Ejecucion de prueba multiplicar");
        Assert.assertEquals(36,calc.multiplicar(6,6));

    }

    @Test

    public void dividirTest(){

        System.out.println("Ejecucion de prueba dividir");
        Assert.assertEquals(6,calc.dividir(36,6));

    }

}
