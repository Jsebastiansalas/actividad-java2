package com.notificacion;

public class Main {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification(
                "email", "ana@correo.com", "Tu pedido ha sido enviado");
        Notification sms = NotificationFactory.createNotification(
                "sms", "3001234567", "Tu codigo de verificacion es 4821");
        Notification push = NotificationFactory.createNotification(
                "push", "dispositivo-123", "Tienes una nueva oferta disponible");

        System.out.println(email.sendNotification());
        System.out.println(sms.sendNotification());
        System.out.println(push.sendNotification());

        try {
            NotificationFactory.createNotification("fax", "000", "prueba");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}