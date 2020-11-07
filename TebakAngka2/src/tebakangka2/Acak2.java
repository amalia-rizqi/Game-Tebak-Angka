/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Acak2 {
    int a;
    int b;
    int i = 1;
    int score = 100;
    int Bonus = 50;

    // methods
    void bilanganAcak(){
        this.a = (int) (Math.random() *100); //acak angka 0-100
        
        System.out.println("Hai..nama saya Mr.Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 1-100. Silakan tebak ya!!!");
         do{
             System.out.println("Tebakan Anda : ");
             Scanner jawab = new Scanner(System.in);
             this.b = jawab.nextInt();
        
        if (i >= 0){
            if (b == a){
            System.out.println("Yee...Bilangan Tebakan Anda Benar");
            break;}
            else if (b < a){
            System.out.println("Hehehe...Bilangan tebakan anda terlalu kecil");
            this.i +=1;
            this.score -=2;
            }
            else if (b > a){
            System.out.println("Hehehe...Bilangan tebakan anda terlalu besar");
            this.i +=1;
            this.score -=2;
            }   
        }
        else{
            break;
        }
    }while (b != a);
    }
    
    void hitungSkor(){
        if (i >=0){
            System.out.println("Score Anda: " + this.score);}
        else if (i <=5){
            System.out.println("Score Anda: " + this.score);
            System.out.println("Bonus: " + this.Bonus);
            System.out.println("Total Score: " + (this.score + this.Bonus));
        }
    }
}