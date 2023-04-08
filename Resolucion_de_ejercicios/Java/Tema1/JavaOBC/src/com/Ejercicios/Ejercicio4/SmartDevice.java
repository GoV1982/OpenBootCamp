package com.Ejercicios.Ejercicio4;

public class SmartDevice {

    //1. Atributos
    String resolucionPantalla;
    int memoriaRam;
    double peso;
    String sistemaOperativo;
    String marca;
    String modelo;
    boolean pantallaTactil;
    String color;
    //2. Constructores

    public SmartDevice(){

    }
    public SmartDevice(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public SmartDevice(String resolucionPantalla, int memoriaRam, double peso, String sistemaOperativo, String marca, String modelo, boolean pantallaTactil, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.resolucionPantalla = resolucionPantalla;
        this.pantallaTactil = pantallaTactil;
        this.memoriaRam = memoriaRam;
        this.color = color;
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "SmartDevice [marca=" + marca + ", modelo="
                + modelo + ", sistema operativo=" + sistemaOperativo + ", resolucion de pantalla="
                + resolucionPantalla + ", memoria RAM=" + memoriaRam + ", color=" + color + ", peso="
                + peso + "]";
    }

    //3. Metodos
}
