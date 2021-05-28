/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // RA2_c)
        String alumno = "Daniel Miranda Torres";
        
        System.out.println("El número de caracteres de alumno es: " + alumno.length());
        System.out.println("El primer caracter de alumno es: '" + alumno.charAt(0) + "' y el último caracter es: '" + alumno.charAt(alumno.length() - 1) + "'");
        System.out.println("El nombre de la variable alumno es: " + alumno.substring(0, alumno.indexOf(" ")));
        System.out.println("El segundo apellido de alumno es: " + alumno.substring(alumno.lastIndexOf(" ") + 1, alumno.length()));
        System.out.println(alumno.replace('a', '_'));
        
        // RA2_i)
        DanielMirandaTorres objeto1 = new DanielMirandaTorres("Daniel Miranda Torres", 29);
        System.out.println("\nEl nombre de objeto1 es: " + objeto1.getNombre() + " y la edad es: " + objeto1.getEdad());
        
        objeto1.setNombre("Francisco Núñez Mérida");
        objeto1.setEdad(27);
        System.out.println("El nuevo nombre de objeto1 es: " + objeto1.getNombre() + " y la nueva edad es: " + objeto1.getEdad());
        
        DanielMirandaTorres objeto2 = new DanielMirandaTorres("Félix Rodríguez de la Fuente", 180);
        System.out.println("El nombre de objeto2 es: " + objeto2.getNombre() + " y la edad es: " + objeto2.getEdad());

        objeto2.setNombre("Julián Astasio Peña");
        objeto2.setEdad(-58);
        System.out.println("El nueva nombre de objeto2 es: " + objeto2.getNombre() + " y la edad es: " + objeto2.getEdad());

        int id = 6;
        int newId = id++;
        System.out.println(id);
        System.out.println(newId);
    }
    
}
