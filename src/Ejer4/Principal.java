
package Ejer4;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        int cod_lab=2;
     String instructor="Lopez";
     String horario="20:00";
     int cupo=2;
        Laboratorio lab =new Laboratorio(cod_lab,instructor,horario,cupo);
        String nombre;
        String apellido;
        int codigo;
        String datos="-----Datos del laboratorio"
                + "\nInstructor : " +instructor +"\n Codigo : "+cod_lab+"\nHorario:"+horario+"\nNumero de cupos : "+cupo;
        
        JOptionPane.showMessageDialog(null,datos);
        for(int i=1;i<=cupo;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo"));
            nombre=JOptionPane.showInputDialog("INgrese el nombre del Estudiante");
            Estudiante e=new Estudiante(nombre,codigo);
            lab.asignaEstudiante(e);
            JOptionPane.showMessageDialog(null,"El estudiante numero "+i);
        }
        JOptionPane.showMessageDialog(null,"Ya no hay cupos en el laboratorio");
        
    }
    
}
