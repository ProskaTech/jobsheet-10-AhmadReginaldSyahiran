//Created by 21343039_Ahmad Reginald Syahiran
package Percobaan3;


public class InformatikaUNP {
    public static void main(String[] args) {
        Mahasiswa informatika = new Mahasiswa();
        Mahasiswa elektronika = new Mahasiswa();

        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universtas Negeri Padang";

        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universtas Negeri Padang";

        System.out.println("\tData Mahasiswa mahasiswa Informatika");
        System.out.println("Nama :  "+ informatika.nama);
        System.out.println("NIM :  "+ informatika.nim);
        System.out.println("Jurusan :  "+ informatika.jur);
        System.out.println("Status :  "+ informatika.univ);

        System.out.println("\n\tData Mahasiswa mahasiswa Elektronika");
        System.out.println("Nama :  "+ elektronika.nama);
        System.out.println("NIM :  "+ elektronika.nim);
        System.out.println("Jurusan :  "+ elektronika.jur);
        System.out.println("Status :  "+ elektronika.univ);


    }
}
