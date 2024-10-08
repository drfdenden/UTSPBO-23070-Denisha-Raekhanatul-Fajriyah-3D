/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiReservasiHotel.User;

/**
 *
 * @author User
 */
public class User {
    String nama;
    String username;
    String password;
    
    public User(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    public String getNama() {
        return nama;
    }
    public String getUsername() {
        return username;
    }
}
