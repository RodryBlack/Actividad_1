
package Ejer4;

import java.util.HashSet;

public class Estudiante {
    
    public String nombre;
    public int codigo;

    public Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    
    HashSet <Laboratorio> laboratorios= new HashSet<Laboratorio>(); 
    Laboratorio laboratorio;
    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setLaboratorio(Laboratorio laboratorio){
        laboratorios.add(laboratorio);
    }
    
    
}
