/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletion14_2020;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class ConversorTemperaturas {

    private static float centigradosminima = 80;

    public ConversorTemperaturas() {
    }

    public float centigradosAFharenheit() throws TemperaturaErradaExcepcion {

        float centigrados = Integer.parseInt(JOptionPane.showInputDialog("Introduce grados centigrados"));

        if (centigrados < centigradosminima) {

            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor que " + centigradosminima + "ºC");

        }

        float fharenheir = (9.0f / 5.0f) * centigrados + 32.4f;

        System.out.print("Los " +centigrados+ " ºC equivalen a: \nGrados Fahrenheit = ");

       return fharenheir ;
       
        
        
        
    }

    public void centígradosAReamur() throws TemperaturaErradaExcepcion {

        float centigrados = Integer.parseInt(JOptionPane.showInputDialog("Introduce grados centigrados"));

        if (centigrados < centigradosminima) {

            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor que " + centigradosminima + "ºC");

        }

        float reamur = (4.0f / 5.0f) * centigrados;

        System.out.println("Los " + centigrados + "ºC equivalen a " + reamur + "º Réamur");
    }
}
