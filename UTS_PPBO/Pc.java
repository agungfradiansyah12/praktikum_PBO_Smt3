/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PPBO;

/**
 *
 * @author WINDOWS 11
 */
public class Pc extends Komputer{
    public int ukuranMonitor;

    public Pc() {
    }

    public Pc(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeProsesor) {
        super(merk, jnsProsesor, kecProsesor, sizeProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        tampilData(); // Memanggil metode tampilData() dari kelas induk
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inci");
    }
}
