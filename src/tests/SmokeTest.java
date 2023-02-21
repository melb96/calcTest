package tests;

import clases.Calculadora;

public class SmokeTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int resultadoEsperado = 6;
        int resultadoObtenido = calc.sumar(0,6);

        if(resultadoEsperado == resultadoObtenido){

            System.out.println("el metodo suma...suma");

        }else {

            System.out.println("el metodo suma...no suma");
        }

    }

}
