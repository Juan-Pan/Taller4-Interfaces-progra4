
package org.example.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();

        coche.setNombre("bmw e36");
        bicicleta.setNombre("GW");

        coche.mostrarNombre();
        coche.mover();
        bicicleta.mostrarNombre();
        bicicleta.mover();
    }
}
