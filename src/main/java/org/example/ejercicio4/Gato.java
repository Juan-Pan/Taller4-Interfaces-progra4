package org.example.ejercicio4;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " maúlla.");
    }

    @Override
    public void mover() {
        System.out.println(getNombre() + " camina.");
    }
}
