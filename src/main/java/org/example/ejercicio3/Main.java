package org.example.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Notificacion[] notificaciones = {
                new Email(),
                new SMS(),
                new NotificacionPush()
        };

        for (Notificacion notificacion : notificaciones) {
            notificacion.enviarNotificacion();
        }
    }
}