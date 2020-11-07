/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Acak {
    int a;
    int b;

    // methods
    void bilanganAcak(){
        this.a = (int) (Math.random() *100); //acak angka 0-100
        
        System.out.println("Hai..nama saya Mr.Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 1-100. Silakan tebak ya!!!");
         do{
             System.out.println("Tebakan Anda : ");
             Scanner jawab = new Scanner(System.in);
             this.b = jawab.nextInt();
             
        if (b == a){
            System.out.println("Yee...Bilangan Tebakan Anda Benar");
        break;}
        else if (b < a){
            System.out.println("Hehehe...Bilangan tebakan anda terlalu kecil");
        }
        else if (b > a){
            System.out.println("Hehehe...Bilangan tebakan anda terlalu besar");
        }
         }
         while (b != a);
    }
}

