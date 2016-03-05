/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Basic;

/**
 *
 * @author rangga
 */
public class SwitchCase {
    	public static void main(String[] args) {
            System.out.println("Pilih kartu HP Favorit Anda : ");
            System.out.println("1. XL");
            System.out.println("2. Simpati");
            System.out.println("3. IM 3");
            int pilihan = 3;
            System.out.println("Pilihan anda : " + pilihan);

            switch(pilihan) {
                case 1 : System.out.println("XL"); break;
                case 2 : System.out.println("Simpati"); break;
                case 3 : System.out.println("IM 3"); break;
                default : System.out.println("Menu Yang Anda Pilih Ada"); break;
            }
	}
}
