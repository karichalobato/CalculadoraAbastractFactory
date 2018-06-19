/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethods;
import AbstractFactoryMethods.Aritmetica.Aritmetica;


import AbstractFactoryMethods.Convertor.Convertor;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public interface AbstractFactory {
    Convertor getconvercionDecimalBinario(String conversion);
    Aritmetica getOperar(String operacion);

}
