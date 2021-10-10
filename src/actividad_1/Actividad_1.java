
package actividad_1;

import javax.swing.JOptionPane;

public class Actividad_1 {

    public static void main(String[] args) {
       int var,sum; 
       Maquina mac= new Maquina(5,20,10);
       System.out.println("Temperatura por defecto "+mac.getDef());
       var=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
       mac.setVar(var);
       sum=mac.getDef()+mac.getVar();
       System.out.println("Ahora la temperatura es "+sum);
       if(sum > mac.getMax()){
           String may= mac.maximos();
           System.out.println(may);
       }
       else{
           if(sum<mac.getMin()){
            String min= mac.minimos();
               System.out.println(min);
           }
           
           else{
               String nor=mac.normal();
               System.out.println(nor);
           }
    }
       
       
    }

    }
    

