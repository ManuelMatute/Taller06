/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public class ReporteFactory {
    public static Reporte crearReporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pdf":
                return new PDFReporte();
            case "excel":
                return new EXCELReporte();
            case "word":
                return new WORDReporte();
            default:
                throw new IllegalArgumentException("Formato no soportado: " + tipo);
        }
    }
}
