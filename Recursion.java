/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

/**
 *
 * @author Aikacchii
 */
public class Recursion {
    public static void main(String[] args) {
        // Rekursi atau pengulangan atau looping
        // contoh array untuk dilooping
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        

        // 1. For Loop
        System.out.println("1. For Loop");
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
        
        // 2. While loop
        System.out.println("2. While Loop");
        
        int j = 0;
        while(j<arr.length){
            System.out.print(arr[j] + " ");
            j++;
        }
        System.out.println("");
        
        // 3. Do-While loop
        System.out.println("3. Do-While Loop");
        
        int k = 0;
        do{
            System.out.print(arr[k] + " ");
            k++;
        } while(k<arr.length);
    }
}
