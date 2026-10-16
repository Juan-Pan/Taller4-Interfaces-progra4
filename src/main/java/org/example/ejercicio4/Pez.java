package org.example.ejercicio4;

public class Pez extends Animal implements Nadador {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " no emite sonidos audibles.");
    }

    @Override
    public void mover() {
        nadar();
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " nada.");
    }
}
