/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PPBO;

/**
 *
 * @author WINDOWS 11
 */
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeProsesor) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeProsesor);
        this.security = security;
    }

    public void tampilMac(){
        tampilLaptop(); // Memanggil metode tampilLaptop() dari kelas induk
        System.out.println("Keamanan: " + security);
    }
}
