/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbodavitk1a;
import java.util.Scanner;

/**
 *
 * @author TK1A Davi Adrian 2401081005
 */
public class mainpersegipanjangEnkapsulasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        persegipanjangEnkapsulasi pp1 = new persegipanjangEnkapsulasi();
        System.out.println("Objek 1 = \nPanjang: " + pp1.getPanjang() + "\nLebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas() + "\nKeliling: " + pp1.getKeliling());
        
        System.out.println("\nMasukkan untuk Persegi Panjang Ke - 2");
        System.out.print("Masukkan panjang: ");
        int panjang = in.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = in.nextInt();
        
        // Bagian yang ada Parameter
        persegipanjangEnkapsulasi pp2 = new persegipanjangEnkapsulasi(panjang, lebar);
        System.out.println("\nObjek 2 \nPanjang: " + pp2.getPanjang() + "\nLebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas() + "\nKeliling: " + pp2.getKeliling());

        System.out.println("\nJumlah objek yang dibuat: " + persegipanjangEnkapsulasi.getJumlahObjek());
    }
}