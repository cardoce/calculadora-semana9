/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author fernandocardoce
 */
public class Calculos {
    
    public double Suma (double a, double b){
        try{
        return a + b;
        }catch(NumberFormatException e){
          return 0;
        }
    }
    
    public double Resta (double a, double b){
        return a - b;
    }
    
    public double Multi (double a, double b){
        return a * b;
    }
    
    public double Division (double a, double b){
        return a / b;
    }
    
}
