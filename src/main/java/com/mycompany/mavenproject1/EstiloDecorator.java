/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public class EstiloDecorator extends DecoratorReporte {
    public EstiloDecorator(Reporte reporte) {
        super(reporte);
    }

    public void generarReporte() {
        super.generarReporte();
        System.out.println("Aplicando estilos al reporte.");
    }

    public void visualizarReporte() {
        super.visualizarReporte();
    }
}