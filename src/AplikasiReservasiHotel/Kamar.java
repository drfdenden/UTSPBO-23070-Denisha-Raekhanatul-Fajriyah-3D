/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiReservasiHotel;

/**
 *
 * @author User
 */
public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private boolean tersedia;
    
    public Kamar(int nomorKamar, String tipeKamar) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.tersedia = true;
    }
    public int getNomorKamar() {
        return nomorKamar;
    }
    public String getTipeKamar() {
        return tipeKamar;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
