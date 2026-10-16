package org.example.ejercicio3;

public class Email implements Notificacion {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por Email");
    }
}
