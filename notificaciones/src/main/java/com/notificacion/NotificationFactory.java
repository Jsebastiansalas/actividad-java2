package com.notificacion;

public class NotificationFactory {

    public static Notification createNotification(String type, String recipient, String message) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo de notificacion no puede ser nulo.");
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification(recipient, message);
            case "sms":
                return new SMSNotification(recipient, message);
            case "push":
                return new PushNotification(recipient, message);
            default:
                throw new IllegalArgumentException("Tipo de notificacion no valido: " + type);
        }
    }
}
