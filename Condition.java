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
public class Condition {
    // kondisi
    public static void main(String[] args) {
        
        int check = 10;
        
        // 1. IF STATEMENT
        
        System.out.println("1. IF");
        
            // 1.1. If
            
            //HINT : \t digunakan untuk indentasi atau sama seperti tab di keyboard
            
            System.out.println("\t1.1. If");
        
            if(check > 5){
                System.out.println("\tcheck lebih besar dari 5");
            }

            // 1.2. If-Else
            System.out.println("\t1.2. If-Else");
            
            if(check < 5){
                System.out.println("\tcheck lebih kecil dari 5");
            } else { //untuk kondisi selain pada if
                System.out.println("\tcheck lebih besar dari atau sama dengan 5");
            }

            // 1.3. If-Else If-Else
            System.out.println("\t1.3. If-Else If-Else");
            
            if(check < 10){
                System.out.println("\tcheck lebih kecil dari 10");
            } else if(check == 10){
                System.out.println("\tcheck sama dengan 10");
            }else {
                System.out.println("\tcheck lebih besar dari 10");
            }
        
        // 2. SWITCH-CASE
        
        //HINT : \n digunakan untuk membuat baris baru atau sama seperti enter di keyboard
        System.out.println("\n2. SWITCH-CASE");
        
        switch(check){ //diisi dengan variabel yang ingin dicek
            case 1 : //case berisi nilai dari variabel tersebut
                System.out.println("check sama dengan 1");
                break; //break agar case lain tidak tereksekusi
            case 3 :
                System.out.println("check sama dengan 3");
                break;
            case 5 :
                System.out.println("check sama dengan 5");
                break;
            case 7 :
                System.out.println("check sama dengan 7");
                break;
            case 9 :
                System.out.println("check sama dengan 9");
                break;
            case 10 :
                System.out.println("check sama dengan 10");
                break;
            default : //fungsinya seperti else
                System.out.println("check bisa saja angka lain");
                break;
        }
    }
}
