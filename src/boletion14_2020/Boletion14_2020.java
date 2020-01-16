/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletion14_2020;

/**
 *
 * @author david
 */
public class Boletion14_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConversorTemperaturas tem1 = new ConversorTemperaturas();

        try {
            System.out.println(tem1.centigradosAFharenheit());
        } catch (TemperaturaErradaExcepcion e) {
            System.out.println("Erro " + e.getMessage());
        }

        try {

            tem1.centígradosAReamur();
        } catch (TemperaturaErradaExcepcion e) {
            System.out.println("Erro " + e.getMessage());

        }

    }

}
