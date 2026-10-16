package org.example.ejercicio1;

public abstract class Vehiculo {
    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


public void mostrarNombre(){
 System.out.println("nombre: " + this.nombre);   
}

public abstract void mover();

}