/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethods.Convertor;

import AbstractFactoryMethods.AbstractFactory;
import AbstractFactoryMethods.Aritmetica.Aritmetica;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class MenuConvertor implements AbstractFactory {
    
     @Override
    public Convertor getconvercionDecimalBinario(String opcion) {
        switch(opcion){
            case "BINARIO":
                return new DecimalBinario();
                
            default:
                return null;
        }
        
    }

    @Override
    public Aritmetica getOperar(String operacion) {
         return null;
        
    }

}
