/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.Bebidas;

/**
 *
 * @author Sandra Suarez
 */
public class Te extends Bebidas {

    @Override
    public double getPrecio() {
     return 0.75;
    }

    @Override
    public String getDescripcion() {
     return "Té";    
    }
    
}
