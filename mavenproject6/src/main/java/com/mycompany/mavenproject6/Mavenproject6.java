/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author alver
 */
public class Mavenproject6 {

    public static void main(String[] args) {
         System.out.println("Star Pattern Is ......");
        System.out.println("-----------------");
        for (int a=1; a<=4;a++) { // a= baris
            for (int b=1;b<=4;b++) { // b = kolom
                if (a==4 || b==2) { // diberikan kondisi dimana jika a nilainya 3 atau b bernilai 2 makan tanda "*" akan di print
                    System.out.print("*"); // perintah untuk menampilkan "*"
                } else { // jika kondisi di atas tidak memenuhi maka yang terprint adalah spasi
                    System.out.print(" "); // perintah untuk menampilkan spasi
                }
            } System.out.println();
        }
    }
}
