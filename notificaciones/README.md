# Sistema de Notificaciones - Patrón Factory

Implementación del patrón de diseño **Factory Method** para la gestión de diferentes canales de notificación (Email, SMS y Push Notifications).

## 📋 Descripción

Este proyecto demuestra el uso del patrón Factory para centralizar la creación de objetos de notificación sin exponer la lógica de instanciación al código cliente. Permite agregar nuevos canales de notificación de forma sencilla sin modificar el código existente.

## 🏗️ Estructura del Proyecto

```
notificaciones/
├── src/main/java/com/notificacion/
│   ├── Notification.java           # Interfaz común
│   ├── EmailNotification.java      # Implementación Email
│   ├── SMSNotification.java        # Implementación SMS
│   ├── PushNotification.java       # Implementación Push
│   ├── NotificationFactory.java    # Fábrica de notificaciones
│   └── Main.java                   # Código cliente
├── pom.xml
└── README.md
```

## 🔧 Componentes

### 1. Interfaz `Notification`
Define el contrato que todas las notificaciones deben cumplir:
```java
public interface Notification {
    String sendNotification();
}
```

### 2. Clases Concretas
Tres implementaciones del canal de notificación:
- **EmailNotification**: Envío por correo electrónico
- **SMSNotification**: Envío por mensaje de texto
- **PushNotification**: Envío por notificación push

### 3. Factory `NotificationFactory`
Centraliza la creación de notificaciones mediante el método:
```java
public static Notification createNotification(String type, String recipient, String message)
```

### 4. Cliente `Main`
Demuestra el uso de la fábrica para crear y enviar notificaciones.

## ⚙️ Requisitos

- **Java**: JDK 17 o superior
- **Maven**: 3.6+ (opcional, se puede compilar con javac)

## 🚀 Cómo Ejecutar

### Opción 1: Con Maven
```bash
cd notificaciones
mvn clean compile exec:java
```

### Opción 2: Con javac/java
```bash
cd notificaciones
javac -d target/classes src/main/java/com/notificacion/*.java
java -cp target/classes com.notificacion.Main
```

### Opción 3: Desde IDE
Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code) y ejecuta la clase `Main.java`.

## 📤 Salida Esperada

```
Correo enviado a ana@correo.com con el mensaje: Tu pedido ha sido enviado
SMS enviado a 3001234567 con el mensaje: Tu codigo de verificacion es 4821
Notificacion push enviada a dispositivo-123 con el mensaje: Tienes una nueva oferta disponible
Error: Tipo de notificacion no valido: fax
```

## 💡 Uso del Patrón Factory

El patrón Factory permite:

✅ **Desacoplar** el código cliente de las clases concretas  
✅ **Centralizar** la lógica de creación en un solo lugar  
✅ **Facilitar** la extensión con nuevos tipos de notificación  
✅ **Simplificar** el código cliente eliminando múltiples `new`  

### Ejemplo de uso:
```java
// Sin Factory (acoplamiento directo)
EmailNotification email = new EmailNotification("user@mail.com", "Hola");

// Con Factory (desacoplado)
Notification email = NotificationFactory.createNotification("email", "user@mail.com", "Hola");
```

## 🔄 Agregar Nuevos Canales

Para agregar un nuevo tipo de notificación (ej: WhatsApp):

1. Crea la clase `WhatsAppNotification` implementando `Notification`
2. Agrega un nuevo `case` en `NotificationFactory`:
```java
case "whatsapp":
    return new WhatsAppNotification(recipient, message);
```
3. El código cliente no necesita cambios

## 📝 Ejercicios Implementados

- ✅ **Ejercicio 1**: Interfaz y clases concretas de notificación
- ✅ **Ejercicio 2**: Implementación de la fábrica (Normal Factory)
- ✅ **Ejercicio 3**: Código cliente utilizando la fábrica

## 👤 Autor

Desarrollado como parte del taller de patrones de diseño.

## 📄 Licencia

Este proyecto es de código abierto y está disponible para fines educativos.
