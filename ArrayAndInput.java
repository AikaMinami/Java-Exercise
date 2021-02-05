/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import library untuk Scanner 
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class ArrayAndInput {
    public static void main(String[] args) {
        //  Scanner untuk input (jangan lupa import terlebih dahulu)
        Scanner sc = new Scanner(System.in);
        
        //  1. Contoh array dengan menggunakan panjang yang sudah diketahui
        System.out.println("1. Array dengan menggunakan panjang yang sudah diketahui");
        String[] arr = new String[5];
        
        //Hasil nomor 1
        System.out.println("Panjang array arr = " + arr.length); //mengakses panjang array
        
        
        //  2. Contoh array dengan menggunakan panjang yang belum diketahui
        //  (dengan meminta input dari user)
        
        // HINT : \n adalah untuk membuat baris baru atau fungsinya seperti enter pada keyboard
        System.out.println("\n2. Array dengan menggunakan panjang yang belum diketahui");
        String[] arr1;
        
        System.out.print("Input panjang array : "); //System.out.print untuk menginput di samping tulisan
        int length = sc.nextInt();
        sc.nextLine(); //untuk mencegah terbacanya enter di nextLine berikutnya 
       
        arr1 = new String [length];
        
        // Hasil nomor 2
        System.out.println("Panjang array arr1 = " + arr1.length);
        
        
        // 3. Contoh array dengan nilai yang sudah diketahui
        System.out.println("\n3. Array dengan nilai yang sudah diketahui");
        String[] arr2 = {"Pikachu", "Eevee", "Bulbasaur", "Charmander", "Squirtle"};   
        
        // Hasil nomor 3
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        
        // 4. Contoh array dengan nilai yang diinputkan oleh user
        System.out.println("\n4.Array dengan nilai yang diinputkan user");
        for(int i=0; i<arr.length; i++){
            System.out.println("Input array di index ke-" + i );
            arr[i] = sc.nextLine();
        }
        
        // Hasil nomor 4
        System.out.println("Array yang telah diinputkan :");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
