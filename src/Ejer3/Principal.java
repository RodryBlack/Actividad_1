package Ejer3;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int op;
        Documento doc =new Documento();
        System.out.println("-----------------SELECCIONE UNA OPCION-----------------");
        System.out.println("1.-CREAR DOCUMENTO");
        System.out.println("2.-MOSTRAR DOCUMENTO");
        System.out.println("3.-MODIFICAR DOCUMENTO");
        System.out.println("4.-ELIMINAR DOCUMENTO");
        System.out.println("5.- SALIR");
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
        switch(op){
            case 1:
                doc.crear();
            case 2:
                doc.mostrar();
            case 3:
                doc.modificar();
            case 4:
                doc.eliminar();
            default:
                break;
        }
    }
}
