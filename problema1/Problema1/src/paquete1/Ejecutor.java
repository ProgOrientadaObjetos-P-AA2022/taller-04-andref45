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
        String nombre = "Juan Vega";
        double c1 = 8;
        double c2 = 7.8;
        double c3 = 8.5;

        Estudiante est = new Estudiante(nombre, c1, c2, c3);

        est.calcularPromedio();

        System.out.printf("%s\n", est);

        String nombre2 = "William Estrada";
        double c_1 = 10;
        double c_2 = 9.3;
        double c_3 = 8.2;

        Estudiante est2 = new Estudiante(nombre2, c_1, c_2, c_3);

        est2.calcularPromedio();

        System.out.printf("%s\n", est2);
    }
}
