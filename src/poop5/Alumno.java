package poop5;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 * 
 * 
 */
public class Alumno {
    private String nombre, apellido, carrera, escuela;
    private int semestre;
    private Fecha fNacimiento;
    
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
   
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
    
}