/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public abstract class DecoratorReporte implements Reporte {
    protected Reporte reporte;

    public DecoratorReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    public void generarReporte() {
        reporte.generarReporte();
    }

    public void visualizarReporte() {
        reporte.visualizarReporte();
    }
}
