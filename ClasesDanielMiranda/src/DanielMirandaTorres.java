/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class DanielMirandaTorres {
    
    // RA2_d)
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            this.nombre = "PERSONA ERRONEA";
            this.edad = 0;
        }
    }
    
    // RA2_e)
    public static void ayuda () {
        System.out.println("Esta clase permite crear personas con un nombre y una edad");
    }
    
    // RA2_h)
    public DanielMirandaTorres() {
        nombre = "Daniel Miranda Torres";
        edad = 29;
    }

    public DanielMirandaTorres(String nombre, int edad) {
        if(edad >= 0 && edad <= 100) {
            this.nombre = nombre;
            this.edad = edad;
        } else {
            this.nombre = "PERSONA ERRONEA";
            this.edad = 0;
        }
    }
    
    
    
}
