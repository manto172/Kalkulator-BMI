/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class bmiberaksi {
   public static void main(String[] args) {
       Scanner kalkulator = new Scanner(System.in);
       
       System.out.println("berat badan (kg):");
       int beratbadan = kalkulator.nextInt();
       
       System.out.println("tinggi badan (cm):");
       int tinggibadan = kalkulator.nextInt();
       
             bmi bmiCalculator = new bmi (beratbadan, tinggibadan);
             
       double bmi = bmiCalculator.hitungBMI();
       System.out.printf("hasil bmi anda adalah : %.2f%n", bmi);
       System.out.println("kategori:" + bmiCalculator.kategoriBMI());
       
       kalkulator.close();
      
            
      
      
       
       
   }
}
