/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author andreflores
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private double s_bas;
    private double s_total;
    private String cedula;

    public Profesores(String nom, String ap, double s_b, String ced) {
        nombre = nom;
        apellido = ap;
        s_bas = s_b;
        cedula = ced;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ap) {
        apellido = ap;
    }

    public void establecerS_Base(double s_b) {
        s_bas = s_b;
    }

    public void calcularS_total() {
        s_total = s_bas + (s_bas * 0.2);
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerS_Base() {
        return s_bas;
    }

    public double obtenerS_total() {
        return s_total;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del profesor\n"
                + "Nombre y apellido: %s %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Cédula: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerS_Base(),
                obtenerS_total(),
                obtenerCedula());
        return cadena;
    }
}
