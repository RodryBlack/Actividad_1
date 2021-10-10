
package Ejer5;


public class revista extends libros{
    private int numart;
    public revista(int codigo, String titulo,String autor,int numart){
        super(codigo,titulo,autor);
        this.numart=numart;
    }

    public int getNumart() {
        return numart;
    }

    public void setNumart(int numart) {
        this.numart = numart;
    }
    public String  mostrardatos(){
        return "Codigo :"+getCodigo()+"\nTitulo : "+getTitulo()+"\nAutor : "+getAutor()+"\nNumero de Articulos "+numart;
        
    }
}
