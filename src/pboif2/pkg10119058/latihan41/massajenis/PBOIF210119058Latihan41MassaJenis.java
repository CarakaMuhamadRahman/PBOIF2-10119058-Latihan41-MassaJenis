/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan41.massajenis;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung massa jenis
 *                     kubus.
 */
public class PBOIF210119058Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kubus kubus = new Kubus();
       
       System.out.println("=========Massa Jenis Kubus========");
       kubus.setSisi(5);
       System.out.println("Sisi : " + kubus.getSisi());
       kubus.setMassa(250);
       System.out.println("Massa : " + kubus.getMassa());
       System.out.println("");
        
        System.out.println("=======Hasil Perhitungan========");
        System.out.println("Volume : " + kubus.hitungVolume(0));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(0,0)); 
    }
    
    
}
