
package Ejer5;

public class enciclopedia extends libros{
   private String volumen;
   private int numpag;
   public enciclopedia(int codigo,String titulo, String autor,int numpag,String volumen ){
       super(codigo,titulo,autor);
       this.volumen=volumen;
       this.numpag=numpag;
   }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }
   @Override
   public String  mostrardatos(){
        return "Codigo :"+getCodigo()+"\nTitulo : "+getTitulo()+"\nAutor : "+getAutor()+"\nVolumen :"+volumen+"\nNumero Paginas : "+numpag;
        
    }
    
}
