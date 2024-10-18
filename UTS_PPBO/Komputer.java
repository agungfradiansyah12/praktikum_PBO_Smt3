/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PPBO;

/**
 *
 * @author WINDOWS 11
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeProsesor;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeProsesor) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeProsesor = sizeProsesor;
    }
    
    public void tampilData(){
        System.out.println("Merk: " + merk);
        System.out.println("Jenis Prosesor: " + jnsProsesor);
        System.out.println("Kecepatan Prosesor: " + kecProsesor + " MHz");
        System.out.println("Size Prosesor: " + sizeProsesor + " nm");
    }
    
}
