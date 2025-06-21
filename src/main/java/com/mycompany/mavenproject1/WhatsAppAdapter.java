/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
class WhatsAppAdapter implements Notificador {
    private ThirdPartyWhatsApp servicio = new ThirdPartyWhatsApp();

    public void enviar(Reporte reporte) {
        servicio.enviarMensaje();
    }
}

