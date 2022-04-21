package uts2013010179;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Soal1 {
    
    public static void main(String[] args) {
        
        boolean isAgain = true;
        int ulangi = 0;
        String pilihan;
        Scanner input = new Scanner(System.in);

        while( isAgain ) {
            String nm_kasir, nm_pembeli, nm_item="", jns_beli="", str_diskon="";
            Integer jml_item=0, no_item, status;
            Double harga=0d, total_byr=0d, diskon, total_diskon=0d;

            System.out.print("Tekan Enter pada Keyboard untuk Memulai!");
            pilihan = input.nextLine();
            
            System.out.println("\n===========PROGRAM KASIR SAOS LLEN===========");
            
            LocalDate tgl_default = LocalDate.now();
            DateTimeFormatter tgl_format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String tgl_transaksi = tgl_default.format(tgl_format);
            
            System.out.print("Masukkan Nama Kasir: ");
            nm_kasir = input.nextLine();
            
            System.out.print("Masukkan Nama Pembeli: ");
            nm_pembeli = input.nextLine();
            
            System.out.println("Status Pembeli");
            System.out.println("1. Reseller");
            System.out.println("2. Pembeli Biasa");
            System.out.print("Masukkan Status Pembeli: ");
            status = input.nextInt();
            
            // percabangan status pembeli
            if(status == 1) {
                jns_beli = "Reseller";
                System.out.println("Menu Item per Kodi");
                System.out.println("No.\tNama Barang\t Harga");
                System.out.println("1. \tSaos Kecap\t Rp. 120.000");
                System.out.println("2. \tSaos Tomat\t Rp. 200.000");
                System.out.println("3. \tSaos Tiram\t Rp. 300.000");
                
                System.out.print("Masukkan Nomor Barang yang dibeli: ");
                no_item = input.nextInt();
                System.out.print("Masukkan Jumlah Barang yang dibeli: ");
                jml_item = input.nextInt();
                switch (no_item) {
                    case 1:
                        nm_item = "Saos Kecap";
                        harga = 120000d;
                        break;
                    case 2:
                        nm_item = "Saos Tomat";
                        harga = 200000d;
                        break;
                    case 3:
                        nm_item = "Saos Tiram";
                        harga = 300000d;
                        break;
                    default:
                        break;
                }
                // menentukan diskon
                if(jml_item >= 1 && jml_item < 3) {
                    str_diskon = "15%";
                    diskon = 0.15;
                    total_diskon = (harga * jml_item) * diskon;
                    total_byr = harga * jml_item - total_diskon;
                } else if(jml_item >= 3 && jml_item < 6) {
                    str_diskon = "20%";
                    diskon = 0.20;
                    total_diskon = (harga * jml_item) * diskon;
                    total_byr = harga * jml_item - total_diskon;
                } else if (jml_item >= 6) {
                    str_diskon = "30%";
                    diskon = 0.30;
                    total_diskon = (harga * jml_item) * diskon;
                    total_byr = harga * jml_item - total_diskon;
                } else {
                    str_diskon = "0%";
                }
                
            }else if(status == 2) {
                jns_beli = "Pembeli Biasa";
                System.out.println("Menu Item per Satuan");
                System.out.println("No.\tNama Barang\t Harga");
                System.out.println("1. \tSaos Kecap\t Rp. 6.000");
                System.out.println("2. \tSaos Tomat\t Rp. 10.000");
                System.out.println("3. \tSaos Tomat\t Rp. 15.000");
                
                System.out.print("Masukkan Nomor Barang yang dibeli: ");
                no_item = input.nextInt();
                System.out.print("Masukkan Jumlah Barang yang dibeli: ");
                jml_item = input.nextInt();
                switch (no_item) {
                    case 1:
                        nm_item = "Saos Kecap";
                        harga = 6000d;
                        break;
                    case 2:
                        nm_item = "Saos Tomat";
                        harga = 10000d;
                        break;
                    case 3:
                        nm_item = "Saos Tiram";
                        harga = 12000d;
                        break;
                    default:
                        break;
                }
                // menentukan diskon
                if(harga * jml_item >= 75000) {
                    str_diskon = "25%";
                    diskon = 0.25;
                    total_diskon = (harga * jml_item) * diskon;
                    total_byr = harga * jml_item - total_diskon;
                } else if(harga * jml_item >= 50000) {
                    str_diskon = "15%";
                    diskon = 0.15;
                    total_diskon = (harga * jml_item) * diskon;
                    total_byr = harga * jml_item - total_diskon;
                } else if (harga * jml_item >= 25000) {
                    str_diskon = "10%";
                    diskon = 0.10;
                    total_diskon = (harga * jml_item) * diskon;
                    total_byr = harga * jml_item - total_diskon;
                } else {
                    str_diskon = "0%";
                }
            }
            
            // Tampilan Struk Nota
            System.out.println("\n==============STRUK PEMBAYARAN===============");
            System.out.println("Tanggal Transaksi:\t || " + tgl_transaksi);
            System.out.println("Nama Kasir:\t\t || " + nm_kasir);
            System.out.println("Nama Pembeli:\t\t || " + nm_pembeli + " (" + jns_beli + ")");
            System.out.println("Nama Item yang dibeli:\t || " + nm_item);
            if(status == 1) {
                System.out.println("Jumlah Item dibeli:\t || " + jml_item + " kodi");
            } else if(status == 2) {
                System.out.println("Jumlah Item dibeli:\t || " + jml_item + " satuan");
            }
            System.out.println("Mendapat Diskon:\t || " + str_diskon);
            System.out.println("Total Diskon:\t\t || " + total_diskon);
            System.out.println("Yang harus dibayarkan: \t || " + harga * jml_item + " - " + total_diskon);
            System.out.println("---------------------------------------------");
            System.out.println("TOTAL BAYAR =\t\t || " + total_byr);
            System.out.println("---------------------------------------------");
            System.out.println("=============================================");
            
            System.out.println("\nApakah ingin mengulang program?");
            System.out.print("Pilih [y/n]> ");
            pilihan = input.next();
            
            // mengecek apakah ingin mengulang
            if( pilihan.equalsIgnoreCase("n") ){
                isAgain = false;
            }
            ulangi++;

        }

    }
    
}
