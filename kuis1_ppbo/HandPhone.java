/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1_ppbo;

/**
 *
 * @author WINDOWS 11
 */
public class HandPhone {
    private String noSeri, model, VersiOs;
    private boolean on = false;
    private int volume = 0;
    private int lastVolume = 0;


    // Konstruktor dengan parameter
    public HandPhone(String noSeri, String model, String VersiOs) {
        this.noSeri = noSeri;
        this.model = model;
        this.VersiOs = VersiOs;
    }

    // Method untuk menghidupkan dan mematikan handphone
    public void power() {
        if (on) {
            System.out.println("Mematikan handphone");
            on = false;
        } else {
            System.out.println("Menyalakan handphone");
            on = true;
        }
    }

    // Method untuk menambah volume
    public void tambahVolume() {
        if (on) {
            if (volume < 100) {
                volume += 20; // Naik kelipatan 20
                if (volume > 100) volume = 100; 
                System.out.println("Volume bertambah: " + volume);
            } else {
                System.out.println("Volume sudah maksimal atau lebih 100");
            }
        } else {
            System.out.println("Handphone dalam keadaan mati, tidak bisa menambah volume");
        }
    }

    // Method untuk mengurangi volume
    public void kurangVolume() {
        if (on) {
            if (volume > 0) {
                volume -= 20; // Turun kelipatan 20
                if (volume < 0) volume = 0; // Pastikan tidak kurang dari 0
                System.out.println("Volume berkurang: " + volume);
            } else {
                System.out.println("Volume sudah mencapai minimum 0, tidak bisa dikurang lagi");
            }
        } else {
            System.out.println("Handphone dalam keadaan mati, tidak bisa mengurangi volume.");
        }
    }

    // Method untuk mute
    public void mute() {
        if (on) {
            if (volume != 0) {
                lastVolume = volume;  // Simpan volume sebelum mute
                volume = 0;
                System.out.println("Handphone dimute. Volume saat ini: " + volume);
            } else {
                volume = lastVolume;  // Kembalikan volume ke nilai sebelum mute
                System.out.println("Handphone unmute. Volume saat ini kembali: " + volume);
            }
        } else {
            System.out.println("Handphone dalam keadaan mati, tidak bisa melakukan mute.");
        }
    }

    // Method untuk menampilkan informasi handphone
    public void info() {
        System.out.println("No Seri: " + noSeri);
        System.out.println("Model: " + model);
        System.out.println("Versi OS: " + VersiOs);
        System.out.println("Handphone " + (on ? "hidup" : "mati"));
        System.out.println("Volume saat ini: " + volume);
    }
    
}
