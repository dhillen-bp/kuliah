package uts2013010179;

import java.util.Scanner;

public class Soal2 {
    
    static Scanner input = new Scanner (System.in) ;
    static boolean isAgain = true;
    
    public static void main(String[] args) {
        
        do {
            System.out.println("======MENGHITUNG LUAS DAN VOLUME BANGUN RUANG======");
            System.out.println("====================MENU PILIHAN===================");
            System.out.println("[1] Tabung");
            System.out.println("[2] Kerucut");
            System.out.println("[3] Bola");
            System.out.println("[4] Exit" );
            System.out.println("Keterangan: Pilih angka 1 sampai 4!");
            System.out.print("Masukkan Pilihan : ");
            int index = input.nextInt();
            
            switch (index) {
                case 1:
                    bangunTabung();
                    break;
                case 2:
                    bangunKerucut();
                    break;
                case 3:
                    bangunBola();
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
                default :
                    break;
            }
            
        } while (isAgain);

    }
    
    // fungsi untuk Tabung
    private static void bangunTabung () {
        
        double r, t, phi, luasPermukaan, volume;
        
        System.out.println("\n----------------Bangun Ruang Tabung----------------");
        
        System.out.print("Masukkan Jari-jari: ");
        r = input.nextDouble();
       
        System.out.print("Masukkan Tinggi: ");
        t = input.nextDouble();
        
        // jika r modulus 7 sisa bagi = 0 atau kelipatan 7 maka phi = 22/7
        if (r % 7 == 0) {
            phi = 22 / 7d;
            System.out.println("Menggunakan phi 22/7");
            luasPermukaan = 2 * phi * r * (r + t);
            System.out.println("Luas Permukaan Tabung = " + luasPermukaan);
            volume = phi * r * r * t;
            System.out.println("Volume Tabung  = " + volume + "\n");
        
        // jika r bukan kelipatan 7 maka phi = 3.14
        } else {
            phi = 3.14d;
            System.out.println("Menggunakan phi 3.14");
            luasPermukaan = 2 * phi * r * (r + t);
            System.out.println("Luas Permukaan Tabung = " + luasPermukaan);
            volume = phi * r * r * t;
            System.out.println("Volume Tabung  = " + volume + "\n");
        }
        
        System.out.println("---------------------------------------------------\n");
    
    }
    
    // fungsi untuk Kerucut
    private static void bangunKerucut () {
        
        double r, t, s, phi, luasPermukaan, volume;
        
        System.out.println("\n---------------Bangun Ruang Kerucut----------------");
        
        System.out.print("Masukkan Jari-jari: ");
        r = input.nextDouble();
       
        System.out.print("Masukkan Tinggi: ");
        t = input.nextDouble();
 
        System.out.print("Masukkan Panjang Garis Pelukis: ");
        s = input.nextDouble();
        
        // jika r modulus 7 sisa bagi = 0 atau kelipatan 7 maka phi = 22/7
        if (r % 7 == 0) {
            phi = 22 / 7d;
            System.out.println("Menggunakan phi 22/7");
            luasPermukaan = phi * r * (r + s);
            System.out.println("Luas Permukaan Kerucut = " + luasPermukaan);
            volume = 1/3d * phi * r * r * t;
            System.out.println("Volume Kerucut  = " + volume + "\n");
        
        // jika r bukan kelipatan 7 maka phi = 3.14
        } else {
            phi = 3.14d;
            System.out.println("Menggunakan phi 3.14");
            luasPermukaan = phi * r * (r + s);
            System.out.println("Luas Permukaan Kerucut = " + luasPermukaan);
            volume = 1/3d * phi * r * r * t;
            System.out.println("Volume Kerucut  = " + volume + "\n");
        }
        
        System.out.println("---------------------------------------------------\n");
    
    }
    
    // fungsi untuk Bola
    private static void bangunBola () {
        
        double r, phi, luasPermukaan, volume;
        
        System.out.println("\n-----------------Bangun Ruang Bola-----------------");

        System.out.print("Masukkan Jari-jari: ");
        r = input.nextDouble();
        
        // jika r modulus 7 sisa bagi = 0 atau kelipatan 7 maka phi = 22/7
        if (r % 7 == 0) {
            phi = 22 / 7d;
            System.out.println("Menggunakan phi 22/7");
            luasPermukaan = 4 * phi * r * r;
            System.out.println("Luas Permukaan Bola = " + luasPermukaan);
            volume = 4/3d * phi * r * r * r;
            System.out.println("Volume Bola  = " + volume + "\n");
        
        // jika r bukan kelipatan 7 maka phi = 3.14
        } else {
            phi = 3.14d;
            System.out.println("Menggunakan phi 3.14");
            luasPermukaan = 4 * phi * r * r;
            System.out.println("Luas Permukaan Bola = " + luasPermukaan);
            volume = 4/3d * phi * r * r * r;
            System.out.println("Volume Bola  = " + volume + "\n");
        }
        
        System.out.println("---------------------------------------------------\n");
    
    }

}
