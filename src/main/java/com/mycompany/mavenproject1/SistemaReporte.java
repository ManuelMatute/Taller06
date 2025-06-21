/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public class SistemaReporte {
    private static SistemaReporte instance;

    private SistemaReporte() {}

    public static SistemaReporte getInstance() {
        if (instance == null) {
            instance = new SistemaReporte();
        }
        return instance;
    }

    public void generarReporte(String tipoReporte, String tipoNotificador) {
        Reporte reporte = ReporteFactory.crearReporte(tipoReporte);
        reporte = new EstiloDecorator(new ColorDecorator(reporte)); // Se pueden combinar
        reporte.generarReporte();
        reporte.visualizarReporte();

        Notificador notificador = NotificadorFactory.crearNotificador(tipoNotificador);
        notificador.enviar(reporte);
    }
}