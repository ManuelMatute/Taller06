/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        SistemaReporte sistema = SistemaReporte.getInstance();
        sistema.generarReporte("pdf", "whatsapp");
    }
}
