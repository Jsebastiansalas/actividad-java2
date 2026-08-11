package com.notificacion;

/**
 * Notificación enviada como push notification.
 */
public class PushNotification implements Notification {
    private final String recipient;
    private final String message;

    public PushNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String sendNotification() {
        return "Notificacion push enviada a " + recipient + " con el mensaje: " + message;
    }
}
