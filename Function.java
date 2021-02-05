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
public class Function {
    public static void main(String[] args) {
        // Ini adalah fungsi main
        
        // Memanggil fungsi tanpa nilai balik
            System.out.println("MEMANGGIL FUNGSI TANPA PARAMETER");
            FTP();
            
            // Memanggil fungsi dengan parameter
            // Jangan lupa untuk memberi nilai di dalam tanda kurung sesuai yang diminta di fungsi yang akan dipanggil
            
            // HINT : Yang penting nilai dari tipe data yang dibutuhkan di parameter benar. 
            //        Nama variabel tidak harus sama, namun tipe data harus sama
            
            // HINT : \n adalah untuk membuat baris baru atau fungsinya seperti enter pada keyboard
            System.out.println("\nMEMANGGIL FUNGSI DENGAN PARAMETER");
            
            String greetings = "Hello World!";
            FDP(greetings);
            System.out.println();
            FDP("Selamat Siang!");
            
        // Memanggil fungsi dengan nilai balik
            //Karena fungsi ini memiliki nilai, jadi nilai tersebut harus disimpan,
            // bisa disimpan di variabel atau array atau apapun
            System.out.println("\nMEMANGGIL FUNGSI DENGAN NIILAI BALIK ");
            
            String salam =  Greetings();  
            System.out.println(salam);
            System.out.println();
            String salam2 =  Greetings2();  
            System.out.println(salam2);
            
            int arr[] = arrInt();
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
    }
        
    
    
    // 1. Tanpa nilai balik(return value)
    //      Fungsi tanpa return value memiliki tipe data void
   
             //Fungsi Tanpa Parameter
             public static void FTP(){
                System.out.println("Ini fungsi tanpa parameter");
             }

             //Fungsi Dengan Parameter
             public static void FDP(String salam){
                System.out.println(salam);
                System.out.println("Ini adalah fungsi dengan parameter " + salam);
             }

    // 2. Dengan nilai balik
    //      Fungsi dengan nilai balik harus memiliki tipe data sesuai dengan nilai yang akan dikembalikan
        
         static String Greetings(){
            String salam = "Nilai Hello Sekai! Dikembalikan Melalui Variabel";
            return salam;
        }
        
        static String Greetings2(){
            return "Nilai Hallo Happy World dikembalikan langsung di return";
        }
        
    //      Tambahan : fungsi juga bisa untuk tipe data array
        static int[] arrInt(){
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            return arr;
        }
        
}
