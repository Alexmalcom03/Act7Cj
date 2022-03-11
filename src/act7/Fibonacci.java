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
public class Fibonacci {

    long array[] = new long[10000];

    public void fibonacci(int n) {

        array[0] = 0;
        array[1] = 1;
        long f1 = 0, f2 = 1, f3;
        for (int i = 2; i <= n; i++) {

            if (i <= 0) {

                f3 = f1 + f2;
                array[i] = f3;
                f1 = f2;
                f2 = f3;
            } else {
                f3 = f1 + f2;
                array[i] = f3;
                f1 = array[i - 1];
                f2 = array[i];

            }

        }
    }
    
      public void imprimirArray(long array[], int n) {
        System.out.println("Numeros fibonacci");
         
        for (int i = 0; i <= n; i++) {

            System.out.print(array[i] + " ");
        }
    }
    
    

    public long[] getArray() {
        return array;
    }

    public void setArray(long[] array) {
        this.array = array;
    }
    
    
   
}
