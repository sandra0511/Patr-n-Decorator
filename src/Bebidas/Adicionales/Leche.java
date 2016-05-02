/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bebidas.Adicionales;

import Decorator.Bebidas.Bebidas;

/**
 *
 * @author Sandra Suarez
 */
public class Leche extends Adicionales_Abstracto{

    public Leche(Bebidas bebida){
        this.bebida=bebida;
    }
    
    
    @Override
    public double getPrecio() {
        return bebida.getPrecio()+0.25; 
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion()+" con Leche";
        }
    
}
