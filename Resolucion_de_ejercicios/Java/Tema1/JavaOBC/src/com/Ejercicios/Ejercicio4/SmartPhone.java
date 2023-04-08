package com.Ejercicios.Ejercicio4;

public class SmartPhone extends SmartDevice{

    private boolean alarma;
    private boolean microsd;
    private boolean altavoz;

    private double capacidadMemoria;
    private String cuatrog;
    private String pantallaTactil;
    private String duracionBateria;

    private int camara;
    private int funda;

    private int chipEmpresaTelefonica;
    private double ram;

    public SmartPhone(){

    }

    public SmartPhone(boolean alarma, boolean microsd, boolean altavoz, double capacidadMemoria,
                      String cuatrog, String pantallaTactil, String duracionBateria, int camara, int funda, int chipEmpresaTelefonica, double ram) {
        super();
        this.alarma = alarma;
        this.microsd = microsd;
        this.altavoz = altavoz;
        this.capacidadMemoria = capacidadMemoria;
        this.cuatrog = cuatrog;
        this.pantallaTactil = pantallaTactil;
        this.duracionBateria = duracionBateria;
        this.camara = camara;
        this.funda = funda;
        this.chipEmpresaTelefonica = chipEmpresaTelefonica;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "alarma=" + alarma +
                ", microsd=" + microsd +
                ", altavoz=" + altavoz +
                ", capacidadMemoria=" + capacidadMemoria +
                ", cuatrog='" + cuatrog + '\'' +
                ", pantallaTactil='" + pantallaTactil + '\'' +
                ", duracionBateria='" + duracionBateria + '\'' +
                ", camara=" + camara +
                ", funda=" + funda +
                ", chipEmpresaTelefonica=" + chipEmpresaTelefonica +
                ", ram=" + ram +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", peso=" + peso +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pantallaTactil=" + pantallaTactil +
                ", color='" + color + '\'' +
                '}';
    }
}
