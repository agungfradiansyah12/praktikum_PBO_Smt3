/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PPBO;

/**
 *
 * @author WINDOWS 11
 */
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeProsesor) {
        super(merk, jnsProsesor, kecProsesor, sizeProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop(){
        tampilData(); 
        System.out.println("Jenis Baterai: " + jnsBatrei);
    }
}
