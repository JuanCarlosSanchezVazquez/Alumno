/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersonaalumno;

import ico.fes.persona.Alumno;

/**
 *
 * @author Juan Carlos Sanchez Vazquez
 */
public class HerenciaPersonaAlumno {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Alumno alumno1 = new Alumno();
    Alumno alumnoExample = new Alumno("99554555", "ICO", 2, "Pedro", 18, 1, 1.83f);
    
    alumno1.setNombre("Juan Carlos Sanchez Vazquez");
    alumno1.setGenero(0);
    alumno1.setEdad(19);
    alumno1.setAltura(1.64f);
    alumno1.setCarrera("Ingenieria en COmputación");
    alumno1.setSemestre(2);
    alumno1.setNumerodeCuenta("31828807-6");
   
        System.out.println(alumno1);
        System.out.println("-----------Ejemplo de las diapostivas-------------");
        System.out.println("  ");
        System.out.println("Datos Personales del alumno");
        System.out.println("Nombre:" + alumnoExample.getNombre());
        System.out.println("Genero:" + alumnoExample.getGenero());
        System.out.println("Edad:" + alumnoExample.getEdad());
        System.out.println("Altura:" + alumnoExample.getAltura());
        System.out.println("Datos academicos");
        System.out.println("Carrera:" + alumnoExample.getCarrera());
        System.out.println("Semestre:" + alumnoExample.getSemestre());
        System.out.println("Numero de Cuenta:" + alumnoExample.getNumerodeCuenta());
    
    }
    
}
