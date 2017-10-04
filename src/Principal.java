/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*PROYECTO PARA */
/**
 *
 * @author 16550549
 */
public class Principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        
        
        // TODO code application logic here
        MiClasePrueba mcObjeto = new MiClasePrueba();
        mcObjeto.imprimirMensaje();
        System.out.println(mcObjeto.Snom);
        MiClasePrueba2.Snom = "Yo";
        MiClasePrueba2.imprimirMensaje();
        System.out.println(MiClasePrueba2.Snom);
        
    }
    
}
class MiClasePrueba{
    public String Snom = "Kevin";
    public void imprimirMensaje(){
        System.out.println("Hola Mundo!!");   
    }
}
class MiClasePrueba2{
    public static String Snom = "Kevin";
    public static void imprimirMensaje(){
        System.out.println("Hola Mundo!!");   
    }
    
}
