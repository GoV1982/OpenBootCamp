package com.EjercicioTema1;

public class Ejercicio1 {
    public static void main(String[] args) {
         int numeroEntero = 10;
         double numeroDouble = 17.662;
         long numeroLong = 12345678900000L;
         char letraCaracter = 'a';
         String letraString = "Lorem Ipsum ...";
         boolean comparacion = true;
         System.out.println("Ejemplo de un int: " + numeroEntero);
         System.out.println("Ejemplo de un double: " + numeroDouble);
         System.out.println("Ejemplo de un long: " + numeroLong);
         System.out.println("Ejemplo de un char: " + letraCaracter);
         System.out.println("Ejemplo de un String: " + letraString);
         System.out.println("Ejemplo de un booleano: " + comparacion);
         boolean ejemploComparacion = (long)numeroEntero == numeroLong;
         System.out.println("Comparando valores: numeroEntero es igual a numeroLong? " + ejemploComparacion);
    }
}


