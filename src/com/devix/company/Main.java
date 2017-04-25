package com.devix.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int dadoA, dadoB, resultado;
        int frecuencia[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 1; i <= 10; i++) {
            dadoA = (int) (6 * Math.random() + 1); //Entre 1 y 6;
            dadoB = (int) (6 * Math.random() + 1);
            resultado = dadoA + dadoB;
            frecuencia[resultado - 2]++;
        }

        System.out.println("Frecuencia de los resultados ");
        for (int i = 0; i <=frecuencia.length; i++) {
            System.out.print("Frecuencia de " + (i + 2));
            System.out.println(": " + frecuencia[i]);
        }
    }
}
