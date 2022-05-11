/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author andreflores
 */
/*Se requiere representar una entidad que permita crear objetos con 
características como: nombre de estudiante, calificación de materia 1, 
calificación de materia 2, calificación de materia 3 y promedio de calificaciones.*/
public class Estudiante {

    private String nombre;
    private double cal1;
    private double cal2;
    private double cal3;
    private double prom;

    public Estudiante(String nom, double c1, double c2, double c3) {
        nombre = nom;
        cal1 = c1;
        cal2 = c2;
        cal3 = c3;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerCal1(double c1) {
        cal1 = c1;
    }

    public void establecerCal2(double c2) {
        cal2 = c2;
    }

    public void establecerCal3(double c3) {
        cal3 = c3;
    }

    public void calcularPromedio() {
        prom = (cal1 + cal2 + cal3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public double obtenerCal3() {
        return cal3;
    }

    public double obtenerPromedio() {
        return prom;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del estudiante\n"
                + "Nombre del estudiante: %s\n"
                + "Calificación materia 1: %.2f\n"
                + "Calificación materia 2: %.2f\n"
                + "Calificación materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(),
                obtenerCal1(),
                obtenerCal2(),
                obtenerCal3(),
                obtenerPromedio());
        return cadena;
    }
}
