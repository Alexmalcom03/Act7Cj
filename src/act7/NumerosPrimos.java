/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author alexm
 */
public class NumerosPrimos {

    int array[] = new int[10000];

    public void numerosPrimos(int n) {

        int contador = 0;
        int i = 0;

        while (contador <= n && i <= array.length) {
            i++;
            int div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div == 2) {
                array[contador] = i;
                contador++;

            }

        }

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void imprimirArray(int arraym[], int n) {
        System.out.println("Numeros Primos");
        for (int i = 0; i <= n; i++) {

            System.out.print(arraym[i] + " ");
        }
    }

}
    
    
    

