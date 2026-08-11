package com.notificacion;

/**
 * Interfaz que define el contrato para todos los tipos de notificación.
 * Cada canal (email, SMS, push) implementa su propio envío.
 */
public interface Notification {
    String sendNotification();
}
