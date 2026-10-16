package org.example.ejercicio4;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " ladra.");
    }

    @Override
    public void mover() {
        System.out.println(getNombre() + " corre.");
    }
}
