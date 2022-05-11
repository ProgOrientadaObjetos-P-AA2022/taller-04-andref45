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
        String nom = "Carlos";
        String ap = "Ríos";
        double s_b = 1250;
        String ced = "110234234";
        Profesores prof = new Profesores(nom, ap, s_b, ced);
        prof.calcularS_total();
        System.out.printf("%s\n", prof);
        
        String nom2 = "Félix";
        String ap2 = "Negredo";
        double s_b2 = 1375;
        String ced2 = "1104326546";
        Profesores prof2 = new Profesores(nom2, ap2, s_b2, ced2);
        prof2.calcularS_total();
        System.out.printf("%s\n", prof2);

    }
}
