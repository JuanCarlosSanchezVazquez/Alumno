/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.persona;

/**
 *
 * @author carlos
 */
public class Alumno  extends Persona{
    
    private String numerodeCuenta;
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String numerodeCuenta, String carrera, int semestre) {
        this.numerodeCuenta = numerodeCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(String numerodeCuenta, String carrera, int semestre, String nombre, int edad, int genero, float altura) {
        super(nombre, edad, genero, altura);
        this.numerodeCuenta = numerodeCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(String numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numerodeCuenta=" + numerodeCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
   
}
