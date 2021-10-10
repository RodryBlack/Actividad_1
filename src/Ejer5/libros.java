
package Ejer5;


public class libros {
    private int codigo;
    private String titulo;
    private String autor;
    

    public libros(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    public String  mostrardatos(){
        return "Codigo :"+codigo+"\nTitulo : "+titulo+"\nAutor : "+autor;
        
    }
    
    
}
