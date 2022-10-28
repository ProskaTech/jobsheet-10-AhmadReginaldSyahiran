//Created by 21343039_Ahmad Reginald Syahiran
package Tugas2;

import java.util.Scanner;
public class Mahasiswa {
    String nama, sks;
    int nim, tingkat;
    double ip;

    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa\t:  ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM\t:  ");
        nim = input.nextInt();
        System.out.print("Semester\t:  ");
        tingkat = input.nextInt();
        System.out.print("IP\t: ");
        ip = input.nextDouble();
    }
    public void identitas(){
        System.out.println("Nama Mahasiswa \t:   " + nama);
        System.out.println("NIM \t:   " + nim);
        System.out.println("Semester \t:   " + tingkat);
        System.out.println("IP \t:  " + ip);
    }
    public void hitung(){
        if (ip >= 3.5 ) {
            System.out.println("Anda berhak mengontrak 24 SKS pada Semester V ");
        }
    
        else if (ip >= 3 && ip < 3.5) {
            System.out.println("Anda berhak mengontrak 22 SKS pada Semester V");
        }
    
        else if (ip >= 2.5 && ip < 3) {
            System.out.println("Anda berhak mengontrak 20 SKS pada Semester V");
        }
    
        else if (ip >= 2 && ip < 2.5) {
            System.out.println("Anda berhak mengontrak 18 SKS pada Semester V");
        }
    
        else {
            System.out.println("Anda berhak mengontrak 15 SKS pada Semester V");
        }
    
        } 
}
