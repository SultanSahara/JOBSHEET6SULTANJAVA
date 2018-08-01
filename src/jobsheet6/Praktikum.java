/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Praktikum {
      public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operator;


        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka Pertama :");
        num1 = input.nextInt();

        System.out.println("Masukkan Angka Kedua :");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Masukkan Operatornya ");
        operator = op.next();

        if ("+".equals(operator));
        {
            System.out.println("Hasil Penjumlahan =" + (num1 + num2));
               }
        if  ("-".equals(operator));
        {
            System.out.println("Hasil Pengurangan =" + (num1 - num2));
        }

        if ("/".equals(operator));
        {
            System.out.println("Hasil Pembagian =" + (num1 / num2));
        }
        if ("*".equals(operator));
        {
            System.out.println("Hasil Perkalian =" + (num1 * num2));
        }
        if ("%".equals(operator));
        {
            System.out.println("Hasil sisa hasil bagi =" + (num1 % num2));
        }
    }

    }

    

