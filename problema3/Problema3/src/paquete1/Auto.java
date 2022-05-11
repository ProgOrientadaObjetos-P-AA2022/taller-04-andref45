/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author andreflores
 */
public class Auto {

    private String ced;
    private String marca;
    private int anio;
    private double valor;
    private double v_mat;

    public Auto(String c, String m, int a, double v) {
        ced = c;
        marca = m;
        anio = a;
        valor = v;
    }

    public void establecerCedula(String c) {
        ced = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void calcularV_mat() {
        v_mat = (0.00002 * valor) * (2022 - anio);
    }

    public String obtenerCedula() {
        return ced;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerV_mat() {
        return v_mat;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos auto\n"
                + "Cédula del propietario: %s\n"
                + "Marca del vehículon: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matrícula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                obtenerValor(),
                obtenerV_mat());
        return cadena;
    }

}
