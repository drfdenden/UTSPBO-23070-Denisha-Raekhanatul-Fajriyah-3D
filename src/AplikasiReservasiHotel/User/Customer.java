/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiReservasiHotel.User;
import AplikasiReservasiHotel.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Customer extends User implements Reservable {
    private Scanner input;
    
    public Customer(String nama, String username, String password) {
        super(nama, username, password);
        input = new Scanner(System.in);
    }
    @Override
    public void reservasiKamar(int nomorKamar) {
        boolean kamarDitemukan = false;
        
        for (Kamar kamar : AplikasiReservasiHotel.daftarKamar) {
            if (kamar.getNomorKamar() == nomorKamar && kamar.isTersedia()) {
                kamar.setTersedia(false);
                AplikasiReservasiHotel.daftarReservasi.add(new Reservasi(kamar, this));
                System.out.println("Kamar " + nomorKamar + " berhasil dipesan!");
                kamarDitemukan = true;
                break;
            }
    }
        if (!kamarDitemukan) {
            System.out.println("Kamar tidak tersedia atau nomor kamar tidak valid.");
        }
}
    public void tampilkanMenu() {
        boolean keluarCustomer = false;
        while (!keluarCustomer) {
            System.out.println("\n======== Menu Customer ========");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Keluar");
            System.out.println("Masukan Pilihan Anda : ");
            int pilihanCustomer = input.nextInt();
            input.nextLine();
            
            switch (pilihanCustomer) {
                case 1:
                    System.out.println("======== Daftar Kamar Tersedia ========");
                    boolean adaKamarTersedia = false;
                    for (Kamar kamar : AplikasiReservasiHotel.daftarKamar) {
                        if (kamar.isTersedia()) {
                            System.out.println("Nomor Kamar: " +kamar.getNomorKamar() + ", Tipe Kamar: " +kamar.getTipeKamar());
                            adaKamarTersedia = true;
                        }
                    }
                    if (adaKamarTersedia) {
                        System.out.println("Masukkan nomor kamar yang ingin Anda pesan: ");
                        int nomorPesan = input.nextInt();
                        reservasiKamar(nomorPesan);
                    }else {
                        System.out.println("Maaf, tidak ada kamar yang tersedia.");
                    }
                    break;
                    
                case 2:
                    System.out.println("======== Daftar Kamar Tersedia ========");
                    boolean adaKamar = false;
                    for (Kamar kamar : AplikasiReservasiHotel.daftarKamar) {
                        if (kamar.isTersedia()) {
                            System.out.println("Nomor Kamar: " +kamar.getNomorKamar() + ", Tipe Kamar: " +kamar.getTipeKamar());
                            adaKamar = true;
                        }
                    }
                    if (!adaKamar) {
                        System.out.println("Maaf, tidak ada kamar yang tersedia.");
                    }
                    break;
                
                case 3:
                    System.out.println("======== Detail Pesanan Anda ========");
                    boolean adaReservasi = false;
                    for (Reservasi reservasi : AplikasiReservasiHotel.daftarReservasi) {
                        if (reservasi.customer == this) {
                            reservasi.tampilkanDetailPesanan();
                            adaReservasi = true;
                        }
                    }
                    if (!adaReservasi) {
                        System.out.println("Anda belum dapat melakukan Reservasi.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Keluar dari menu customer...");
                    keluarCustomer = true;
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
}
