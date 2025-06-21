# Taller06

# Proyecto: Sistema de Gestión de Reportes - Taller de Ingeniería de Software

## Descripción

Este proyecto fue desarrollado como parte del taller de Ingeniería de Software, con el objetivo de implementar un sistema que permita **generar, visualizar y notificar reportes** en diferentes formatos, aplicando principios de diseño orientado a objetos y patrones de diseño clásicos.

## Objetivo del diseño

El diseño del sistema fue guiado por los siguientes requerimientos clave:

- Soportar múltiples formatos de reporte (PDF, Excel, Word).
- Permitir personalización visual dinámica (colores, estilos, etc.).
- Asegurar una única instancia del generador de reportes (control centralizado).
- Integrar distintos servicios de notificación, cada uno con interfaces distintas.

Para cumplir con estos requerimientos, decidimos aplicar una arquitectura basada en los **patrones de diseño Factory Method, Decorator, Adapter y Singleton**. Las clases implementadas reflejan directamente la aplicación de estos patrones y las necesidades funcionales del sistema.

---

## Justificación de las clases implementadas

### 1. `Reporte`, `PDFReporte`, `EXCELReporte`, `WORDReporte`
Estas clases representan los diferentes tipos de reportes que se pueden generar. Se definió una interfaz común `Reporte` que permite garantizar que todos los formatos implementen los mismos métodos. Esto facilita su manejo polimórfico. Se eligieron estas clases para reflejar la extensibilidad del sistema: en el futuro se pueden agregar nuevos formatos sin alterar la lógica existente.

### 2. `ReporteFactory`
Implementamos esta clase para encapsular la lógica de creación de reportes. Gracias al patrón Factory Method, podemos crear objetos según el tipo solicitado, respetando el principio de abierto/cerrado. Esto facilita el mantenimiento del código y permite añadir nuevos tipos sin modificar el núcleo del sistema.

### 3. `DecoratorReporte`, `ColorDecorator`, `EstiloDecorator`
Estas clases permiten agregar características visuales a los reportes (como colores o estilos tipográficos) sin alterar las clases base. El uso del patrón Decorator nos da la flexibilidad de combinar decoradores en tiempo de ejecución, dependiendo de las necesidades del usuario. Esta fue una parte clave del requerimiento de personalización dinámica.

### 4. `Notificador`, `EmailNotificador`, `WhatsAppAdapter`, `TelegramAdapter`
Para gestionar el envío de reportes, creamos una interfaz común `Notificador`. Dado que los servicios de mensajería externos (como WhatsApp y Telegram) tienen APIs diferentes, implementamos adaptadores (`WhatsAppAdapter`, `TelegramAdapter`) que traducen esas interfaces al formato esperado por el sistema. Esto nos permitió mantener un único punto de entrada para todas las notificaciones.

### 5. `NotificadorFactory`
Similar a la fábrica de reportes, esta clase encapsula la creación de los distintos notificadores. Gracias a ella, podemos decidir en tiempo de ejecución qué medio de notificación se usará, manteniendo el sistema flexible y extensible.

### 6. `SistemaReporte` (Singleton)
Esta clase representa el punto central de control del sistema. Como no tiene sentido tener múltiples instancias que gestionen reportes por separado, implementamos esta clase como un Singleton. Así aseguramos una única instancia activa, que coordina tanto la generación como la notificación del reporte.

### 7. `Main`
Finalmente, la clase `Main` nos permite ejecutar una demostración funcional del sistema. Simula el flujo completo: creación del reporte, aplicación de decoradores y envío por el medio de notificación seleccionado.

---

## Herramientas utilizadas

- **Lucidchart**: Para el modelado del diagrama de clases UML.
- **NetBeans**: Como entorno de desarrollo para implementar y probar el sistema en Java.

---

## Conclusión

Como grupo, optamos por este conjunto de clases y patrones porque ofrecen una solución modular, escalable y mantenible. La implementación respeta los principios SOLID y permite extender el sistema fácilmente con nuevos tipos de reportes o canales de notificación en el futuro. Además, la separación de responsabilidades facilita las pruebas, la colaboración en equipo y el mantenimiento a largo plazo del sistema.

