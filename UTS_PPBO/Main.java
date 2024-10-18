/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PPBO;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk Mac
        Mac mac = new Mac("FileVault", "Li-ion", "Apple", "M1", 3000, 5);
        System.out.println("=== Data Mac ===");
        mac.tampilMac();
        System.out.println();

        // Membuat objek untuk Windows
        Windows windows = new Windows("Windows Hello", "Li-ion", "Dell", "Intel i7", 3200, 14);
        System.out.println("=== Data Windows ===");
        windows.tampilWindows();
        System.out.println();

        // Membuat objek untuk Pc
        Pc pc = new Pc(24, "Asus", "Ryzen 5", 3600, 7);
        System.out.println("=== Data PC ===");
        pc.tampilPc();
    }
}
