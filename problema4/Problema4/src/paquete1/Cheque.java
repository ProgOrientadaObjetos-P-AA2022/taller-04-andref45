/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author andreflores
 */
public class Cheque {

    private String nom;
    private String nom_b;
    private double v_ch;
    private double com_b;

    public Cheque(String n, String n_b, double v_cheque) {
        nom = n;
        nom_b = n_b;
        v_ch = v_cheque;
    }

    public void establecerNombre(String n) {
        nom = n;
    }

    public void establecerNombreB(String n_b) {
        nom_b = n_b;
    }

    public void establecerV_Ch(double v_cheque) {
        v_ch = v_cheque;
    }

    public void calcularComi() {
        com_b = v_ch * 0.00003;
    }

    public String obtenerNombre() {
        return nom;
    }

    public String obtenerNombreB() {
        return nom_b;
    }

    public double obtenerV_Ch() {
        return v_ch;
    }

    public double obtenerComi() {
        return com_b;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del cheque\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión cobrada por el banco: %.2f%%\n",
                obtenerNombre(),
                obtenerNombreB(),
                obtenerV_Ch(),
                obtenerComi());
        return cadena;
    }
}
