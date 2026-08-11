package com.notificacion;

/**
 * Notificación enviada por SMS.
 */
public class SMSNotification implements Notification {
    private final String recipient;
    private final String message;

    public SMSNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String sendNotification() {
        return "SMS enviado a " + recipient + " con el mensaje: " + message;
    }
}
