/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class Latihan2 {
    public static void main (String [] args) throws IOException {
        String nama;
        //Membuat Objek Inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat Objek BufferedReader
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan buffereader
        System.out.print("Inputkan Nama: ");
        nama = br.readLine();
        //tampilkan output isi variabel nama
        System.out.println("nama Kamu adalah: " + nama);

    }
}
