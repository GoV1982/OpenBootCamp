public class Ejercicos_tema_3_Parte2 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        miCoche.addPuerta();
        System.out.println("El numero de puertas del miCoche es: " + miCoche.puertas + " puertas.");
    }

}

class Coche {

    public int puertas = 4;

    public void addPuerta() {
        this.puertas++;
    }
}