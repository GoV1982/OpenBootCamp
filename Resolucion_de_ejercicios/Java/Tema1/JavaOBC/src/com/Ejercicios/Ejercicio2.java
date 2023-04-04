package com.Ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(sumaIva(85));
    }
    static double sumaIva(double precio){
        return precio + (precio * 0.21d);
    }
}
