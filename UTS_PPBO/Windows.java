/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PPBO;

/**
 *
 * @author WINDOWS 11
 */
public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeProsesor) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeProsesor);
        this.fitur = fitur;
    }

    public void tampilWindows(){
        tampilLaptop(); // Memanggil metode tampilLaptop() dari kelas induk
        System.out.println("Fitur: " + fitur);
    }    
}
