package org.example.ejercicio4;

public abstract class Animal {
    private final String nombre;

    protected Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void hacerSonido();

    public abstract void mover();
}
