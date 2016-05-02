 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.Bebidas;

import Bebidas.Adicionales.Azucar;
import Bebidas.Adicionales.Leche;
import Bebidas.Adicionales.crema;

/**
 *
 * @author Sandra Suarez
 */
public class Ejemplo_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Bebidas bebida= new Cafe();
        bebida=new Leche(bebida);
         bebida=new crema(bebida);
        //bebida=new Azucar(bebida);
       
        
        System.out.println(bebida.getDescripcion() + "  Cuesta: " +bebida.getPrecio());
   
           
}
}
