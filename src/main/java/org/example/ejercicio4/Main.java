package org.example.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("El perro"),
                new Gato("El gato"),
                new Pez("El pez")
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
            animal.mover();
        }
    }
}
