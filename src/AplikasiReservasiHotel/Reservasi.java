/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiReservasiHotel;
import AplikasiReservasiHotel.User.*;

/**
 *
 * @author User
 */
public class Reservasi {
    public Kamar kamar;
    public Customer customer;
    
    public Reservasi(Kamar kamar, Customer customer) {
        this.kamar = kamar;
        this.customer = customer;
    }
    public Kamar getKamar() {
        return kamar;
    }
    public Customer getCustomer() {
        return customer;
    }
    
    public void tampilkanDetailPesanan() {
        System.out.println("======== Detail Pesanan ========");
        System.out.println("Nama Customer   : " +customer.getNama());
        System.out.println("No Kamar        : " +kamar.getNomorKamar());
        System.out.println("Tipe Kamar      : " +kamar.getTipeKamar());
    }
}
