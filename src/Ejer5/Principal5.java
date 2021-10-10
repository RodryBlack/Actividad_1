
package Ejer5;


public class Principal5 {
    public static void main(String[] args) {
        libros lib[]=new libros[5];
        
        lib[0]=new libros(1,"mate","jose");
        lib[1]=new enciclopedia(1,"mate","jose",2,"II");
        lib[2]=new mapa(1,"mate","jose","desktop",123,432);
        lib[3]=new revista(1,"mate","jose",34);
        lib[4]=new cartilla(1,"mate","jose","Resumen");
        
        for(libros libro: lib){
            System.out.println(libro.mostrardatos());
            System.out.println("");
}
    }
    
    
}
