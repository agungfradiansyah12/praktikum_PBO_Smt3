/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis1_ppbo;

/**
 *
 * @author WINDOWS 11
 */
public class DemoHP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HandPhone hp = new HandPhone("12052005", "Redmi Note 12", "HyperOS 1.0.4.0");
        
        // Menampilkan info handphone yang sedang mati
        hp.info(); 
        System.out.println("");
        
        hp.tambahVolume();
        // Menyalakan handphone
        hp.power();  
        System.out.println("");

        
        // Volume bertambah 5
        hp.tambahVolume();  
        hp.tambahVolume();  
        hp.tambahVolume();
        hp.tambahVolume(); 
        hp.tambahVolume(); 
        hp.tambahVolume(); 
        System.out.println("");
        
        // Volume berkurang 5
        hp.kurangVolume();
        hp.kurangVolume();  
        hp.kurangVolume();  
        hp.kurangVolume(); 
        hp.kurangVolume();  
        hp.kurangVolume();  

        System.out.println("");
        
        hp.tambahVolume();
        
        // Handphone di-mute (volume menjadi 0)
        hp.mute();  
        System.out.println("");
        
        // Unmute (volume kembali ke nilai sebelum mute)
        hp.mute();  
        System.out.println("");
        
        ;
        
        // Mematikan handphone
        hp.power();  
        System.out.println("");
        
        // Tidak bisa menambah volume karena handphone mati
        hp.tambahVolume();  
    }
    
}
