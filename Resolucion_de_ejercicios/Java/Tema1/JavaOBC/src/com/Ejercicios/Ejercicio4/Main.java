package com.Ejercicios.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        SmartDevice smdevice = new SmartDevice("1024x480", 4, 0.44d, "Android",
                "Samsung", "SM-OGT 454", true, "Azul");
        System.out.println("Su modelo es " + smdevice);

        SmartPhone smphone = new SmartPhone(true, true, true, 1024, "4G", "Tactil", "12 horas", 16, 1, 3, 1024);
        System.out.println("Su modelo es " + smphone);

        SmartWatch smwatch = new SmartWatch(true, true, true, true, "Negra", "PingoWatch", "1 metro");
        System.out.println("Su modelo es " + smwatch);
    }

}
