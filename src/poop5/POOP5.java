/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Snchez Ramirez Miguel Angel
 */
public class POOP5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1  = new Alumno();
        alumno1.setNombre("Pedro");
        alumno1.setApellido("Torres");
        Fecha fecha;
        fecha = new Fecha(29,9,2023);
        Alumno alumno2 = new Alumno("Pedro","Torres","Computacion","Facultad de Ingenieria",4,fecha);
        String var = alumno1.toString();
        System.out.println(var);
        System.out.println(alumno1.toString());
        System.out.println(alumno2);
        // TODO code application logic here
        
    }
    
}
