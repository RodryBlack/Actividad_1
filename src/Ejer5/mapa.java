
package Ejer5;


public class mapa extends libros {
    private String ubicacion;
    private int latitud;
    private int longitud;
    
    public mapa(int codigo,String titulo,String autor,String ubicacion,int latitud, int longitud){
        super(codigo,titulo,autor);
        this.latitud=latitud;
        this.ubicacion=ubicacion;
        this.longitud=longitud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
     public String  mostrardatos(){
        return "Codigo :"+getCodigo()+"\nTitulo : "+getTitulo()+"\nAutor : "+getAutor()+"\nUbicacion :"+ubicacion+"\nLatitud : "+latitud+"\nLongitud"+longitud;
        
    }
}
