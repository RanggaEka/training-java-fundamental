/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Basic;

/**
 *
 * @author rangga
 */

//property
class Member{
    public String nama;
}

//property
public class ClassMember {
    //method
    public static void menampilkanNama(){  
        Member mb = new Member();
        mb.nama = "Rangga";
        System.out.println("nama adalah "+ mb.nama);
    }    
    
    //running method
    public static void main(String[] nama){
     menampilkanNama();    
    }
    
}
