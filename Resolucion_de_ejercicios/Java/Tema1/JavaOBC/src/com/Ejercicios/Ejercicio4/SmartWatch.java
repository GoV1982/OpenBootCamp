package com.Ejercicios.Ejercicio4;

public class SmartWatch extends SmartDevice{

    private boolean controlTemperaturaCorporal;
    private boolean monitorFrecuencia;
    private boolean recibeNotificaciones;
    private boolean recibellamadas;

    private String correa;
    private String modelo;
    private String resistencialAgua;

    public SmartWatch(){

    }

    public SmartWatch(boolean controlTemperaturaCorporal, boolean monitorFrecuencia, boolean recibeNotificaciones, boolean recibellamadas, String correa, String modelo, String resistencialAgua) {
        super();
        this.controlTemperaturaCorporal = controlTemperaturaCorporal;
        this.monitorFrecuencia = monitorFrecuencia;
        this.recibeNotificaciones = recibeNotificaciones;
        this.recibellamadas = recibellamadas;
        this.correa = correa;
        this.modelo = modelo;
        this.resistencialAgua = resistencialAgua;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "controlTemperaturaCorporal=" + controlTemperaturaCorporal +
                ", monitorFrecuencia=" + monitorFrecuencia +
                ", recibeNotificaciones=" + recibeNotificaciones +
                ", recibellamadas=" + recibellamadas +
                ", correa='" + correa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", resistencialAgua='" + resistencialAgua + '\'' +
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
