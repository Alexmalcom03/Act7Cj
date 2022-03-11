/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7;

/**
 *
 * @author alexm
 */
public class Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumerosPrimos n = new NumerosPrimos();
        Fibonacci f = new Fibonacci();

        f.fibonacci(100);
        f.imprimirArray(f.getArray(), 100);
        System.out.println("");
        n.numerosPrimos(100);
        n.imprimirArray(n.getArray(), 100);
        
         
        
        
        
    }
    
    
    
   
    
}
