/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AplikasiReservasiHotel;
import AplikasiReservasiHotel.User.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
//NOTE: login admin gunakan username:admin, password:admin123
//      login customer gunakan username:customer, password:cust123

public class AplikasiReservasiHotel {
    public static ArrayList<Kamar> daftarKamar = new ArrayList<>();
    public static ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Admin admin = new Admin("Admin Hotel", "admin", "admin123");
        Customer customer = new Customer("Denisha", "customer", "cust123");
        
        daftarKamar.add(new Kamar(101, "Standard"));
        daftarKamar.add(new Kamar(102, "Standard"));
        daftarKamar.add(new Kamar(103, "Deluxe"));
        daftarKamar.add(new Kamar(104, "Deluxe"));
        daftarKamar.add(new Kamar(105, "Suite"));
        
        boolean keluarProgram = false;
        
        while (!keluarProgram) {
            System.out.println("===== SELAMAT DATANG DI APLIKASI RESERVASI HOTEL =====");
            System.out.println("1. Masuk sebagai Admin");
            System.out.println("2. Masuk sebagai Customer");
            System.out.println("3. Keluar");
            System.out.println("Masukan Pilihan Anda: ");
            int pilihanAwal = input.nextInt();
            input.nextLine();
            
            switch (pilihanAwal) {
                case 1:
                    System.out.println("Username    : ");
                    String usernameAdmin = input.nextLine();
                    System.out.println("Password    : ");
                    String passwordAdmin = input.nextLine();
                    
                    if (admin.login(usernameAdmin, passwordAdmin)) {
                        admin.tampilkanMenu();
                    }else {
                        System.out.println("Username atau password salah.");
                    }
                    break;
                    
                case 2:
                    System.out.println("Username    : ");
                    String usernameCustomer = input.nextLine();
                    System.out.println("Password    : ");
                    String passwordCustomer = input.nextLine();
                    
                    if (customer.login(usernameCustomer, passwordCustomer)) {
                        customer.tampilkanMenu();
                    }else {
                        System.out.println("Username atau password salah.");
                    }
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }

}
