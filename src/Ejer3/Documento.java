
package Ejer3;

import javax.swing.JOptionPane;

public class Documento {
    private String nombre;
    private String tipo;
    private String direccion;
    

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDireccion(String direccion ) {
        this.direccion = direccion;
    }
    
    public void crear(){
        nombre=JOptionPane.showInputDialog("Digite el nombre");
        tipo=JOptionPane.showInputDialog("Digite el tipo");
        direccion=JOptionPane.showInputDialog("Digite la direccion del documento");
        System.out.println("Se creo un documento ");
        
    }
     public void mostrar(){
        System.out.println("Nombre del Documento : "+nombre +"\nTipo de Documento: "+tipo+"\nDireccion del documento "+direccion);
        
    }
      public void modificar(){
          
        System.out.println("Se modifico el documento");
        
    }
       public void eliminar(){
        direccion="";
        System.out.println("Se borro la ruta del directorio");
        
    }
    
}
