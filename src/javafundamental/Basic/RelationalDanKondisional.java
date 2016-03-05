/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Basic;

/**
 *
 * @author rangga
 */
class Nama{
    public String nama;
    public Integer nilai;
}

public class RelationalDanKondisional {
    
    public static void main (String[] relkon){
        //kondisi
        Nama nm = new Nama();
        nm.nama = "test";
        nm.nilai = 52;
        String nama2 = "123";
        
        //operator && maka kedua variabel bernilai TRUE
        if(nm.nama.equals("test") && nama2.equals("123")){
            System.out.println("nama sesuai");
        }else{
            System.out.println("nama tidak sesuai");
        }
        System.out.println("\n");
        //operator || maka salah satu variabel bernilai TRUE / FALSE
        if(nm.nama.equals("test") || nama2.equals("123")){
            System.out.println("nama sesuai");
        }else{
            System.out.println("nama tidak sesuai");
        }
        System.out.println("\n");
        //operator != maka variabel bernilai TRUE / FALSE
        if(nm.nama.equals("test") != nama2.equals("123")){
            System.out.println("nama sesuai");
        }else{
            System.out.println("nama tidak sesuai");
        }
        
        System.out.println("\n");
        //relational perbandingan
        if(nm.nilai < Integer.valueOf(10)){
            System.out.println("nilai lebih kecil");
        }else{
            System.out.println("nilai lebih besar");
        }
                
    }
    
}
