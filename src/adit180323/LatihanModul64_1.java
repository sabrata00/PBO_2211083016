/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adit180323;
import java.util.Scanner;
/**
 *
 * @author Windows 10 Pro
 */
public class LatihanModul64_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();
        int hasil = 1;
        int counter = 1;
        while (counter <= pangkat) {
            hasil *= angka;
            counter++;
        }
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
