/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Manue
 */
public class EmailNotificador implements Notificador {
    public void enviar(Reporte reporte) {
        System.out.println("Enviando reporte por Email.");
    }
}
