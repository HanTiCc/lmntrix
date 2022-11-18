/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author alver
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        String huruf;
        Scanner scan= new Scanner(System.in);
        System.out.print("Masukkan satu huruf anda (A - Z) = ");
        huruf=scan.next();
        if ("a".equalsIgnoreCase(huruf)) {
            System.out.print("Huruf Vokal");
        } else {
            if ("e".equalsIgnoreCase(huruf)) {
            System.out.print("Huruf Vokal");
        } else {
            if ("i".equalsIgnoreCase(huruf)) {
            System.out.print("Huruf Vokal");
        } else {
            if ("o".equalsIgnoreCase(huruf)) {
            System.out.print("Huruf Vokal");
        } else {
            if ("u".equalsIgnoreCase(huruf)) {
            System.out.print("Huruf Vokal");
        } else {
        System.out.println("Huruf Konsonan");
            }
            }
            }
            }
        }
    }
}

