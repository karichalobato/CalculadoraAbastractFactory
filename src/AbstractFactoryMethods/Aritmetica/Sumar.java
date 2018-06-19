/*
 *Operacion de suma
 */
package AbstractFactoryMethods.Aritmetica;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Sumar implements Aritmetica {
     @Override
    public double operar(double a, double b) {
        return a+b;
    }
    
}
