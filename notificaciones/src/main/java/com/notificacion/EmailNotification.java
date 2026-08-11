package com.notificacion;

/**
 * Notificación enviada por correo electrónico.
 */
public class EmailNotification implements Notification {
    private final String recipient;
    private final String message;

    public EmailNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String sendNotification() {
        return "Correo enviado a " + recipient + " con el mensaje: " + message;
    }
}
