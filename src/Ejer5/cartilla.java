
package Ejer5;

public class cartilla extends libros{
    private String tema;
    
    public cartilla(int codigo, String titulo, String autor,String tema){
        super(codigo,titulo,autor);
        this.tema=tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public String  mostrardatos(){
        return "Codigo :"+getCodigo()+"\nTitulo : "+getTitulo()+"\nAutor : "+getAutor()+"\nTema : "+tema;
        
    }
}
