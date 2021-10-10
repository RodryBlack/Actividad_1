
package Ejer4;

import java.util.HashSet;

public class Laboratorio {
    
   
    public int codigo;
    public String instructor;
    public String horario;
    public int cupo;

    public Laboratorio(int codigo, String instructor, String horario, int cupo) {
        this.codigo = codigo;
        this.instructor = instructor;
        this.horario = horario;
        this.cupo = cupo;
    }
    
    HashSet<Estudiante> estudiantes= new HashSet<Estudiante>();
    
    public void asignaEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
        estudiante.setLaboratorio(this);
    }
    
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getHorario() {
        return horario;
    }

    public int getCupo() {
        return cupo;
    }
    
    public void setEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
}
