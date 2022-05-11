/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        String ced = "1105434652";
        String marca = "Ford";
        int anio = 2017;
        double valor = 34000;

        Auto aut = new Auto(ced, marca, anio, valor);
        aut.calcularV_mat();
        System.out.printf("%s\n", aut);

        String ced2 = "1105678916";
        String marca2 = "Mazda";
        int anio2 = 2015;
        double valor2 = 15764;

        Auto aut2 = new Auto(ced2, marca2, anio2, valor2);
        aut2.calcularV_mat();
        System.out.printf("%s\n", aut2);

    }
}
