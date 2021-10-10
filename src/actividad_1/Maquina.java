
package actividad_1;

public class Maquina {
    private int min;
    private int max;
    private int var;
    private int defecto;
    
    
    public Maquina(int min,int max,int defecto){
        this.min=min;
        this.max=max;
        this.defecto=defecto;
    }

    public int getMin() {
        return min;
    }
    public int getDef() {
        return defecto;
    }

    public int getMax() {
        return max;
    }

    public int getVar() {
        return var;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setVar(int var) {
        this.var = var;
    }
    
    public void setDef(int defecto) {
        this.defecto = defecto;
    }
    
    public String maximos(){
        return "La temperatura del calentador de agua alcanzo los niveles maximos";
        
    }
    public String minimos(){
        return "La temperatura del calentador de agua alcanzo los niveles minimos";
        
    }
    public String normal(){
        return "La temperatura del calentador de agua es normal";
        
    }
    
}