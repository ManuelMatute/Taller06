/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public class NotificadorFactory {
    public static Notificador crearNotificador(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotificador();
            case "whatsapp":
                return new WhatsAppAdapter();
            case "telegram":
                return new TelegramAdapter();
            default:
                throw new IllegalArgumentException("Tipo de notificador no válido: " + tipo);
        }
    }
}
