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
        String nombre = "Rubén Jimenez";
        String nombreB = "Banco de Loja";
        double valorCH = 700;

        Cheque ch = new Cheque(nombre, nombreB, valorCH);

        ch.calcularComi();

        System.out.printf("%s\n", ch);

        String nombre2 = "Alex Cabrera";
        String nombreB2 = "Banco Pichincha";
        double valorCH2 = 3400;

        Cheque ch2 = new Cheque(nombre2, nombreB2, valorCH2);

        ch2.calcularComi();

        System.out.printf("%s\n", ch2);
    }

}
