/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import Java.io.*;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class Latihan8 {
    public static void main (String [] args){
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = " ";
        int hitungLuas=0;
        System.out.println("---Luas Persegi---");
        System.out.print("Masukkan nilai sisi");
        
        try {
            x = data.readLine();
            int angka = Integer.parseInt(x);
            hitungLuas = angka * angka;
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Luas Persegi dengan sisi " + x + " Adalah" +hitungLuas);
    }
}
