/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiReservasiHotel.User;
import AplikasiReservasiHotel.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Admin extends User {
    private Scanner input;

    public Admin(String nama, String username, String password) {
        super(nama, username, password);
        input = new Scanner(System.in);
    }
    public void tampilkanDaftarKamar() {
        System.out.println("======== Daftar Kamar ========");
        for (Kamar kamar : AplikasiReservasiHotel.daftarKamar) {
            System.out.println("Nomor Kamar: " +kamar.getNomorKamar() +
                    ", Tipe Kamar: " +kamar.getTipeKamar() +
                    ", Tersedia: " +kamar.isTersedia());
        }
    }
    public void tampilkanReservasi() {
        System.out.println("======== Reservasi Customer ========");
        if (AplikasiReservasiHotel.daftarReservasi.isEmpty()) {
            System.out.println("Belum ada reservasi yang dilakukan.");
        }else {
            for (Reservasi reservasi : AplikasiReservasiHotel.daftarReservasi) {
                System.out.println("Nama Customer   : " +reservasi.customer.getNama());
                System.out.println("No. Kamar       : " +reservasi.kamar.getNomorKamar());
                System.out.println("Tipe Kamar      : " +reservasi.kamar.getTipeKamar());
            }
        }
    }
    public void tampilkanMenu() {
        boolean keluarAdmin = false;
        while (!keluarAdmin) {
            System.out.println("\n======== Menu Admin ========");
            System.out.println("1. Lihat Daftar Kamar");
            System.out.println("2. Lihat Reservasi Customer");
            System.out.println("3. Keluar");
            System.out.println("Masukan Pilihan Anda: ");
            int pilihanAdmin = input.nextInt();
            input.nextLine();
            
            switch (pilihanAdmin) {
                case 1:
                    tampilkanDaftarKamar();
                    break;
                case 2:
                    tampilkanReservasi();
                    break;
                case 3:
                    System.out.println("Keluar dari menu admin...");
                    keluarAdmin = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
        }
    }
}
}