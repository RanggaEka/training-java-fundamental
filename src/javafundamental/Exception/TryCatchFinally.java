/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Exception;

/**
 *
 * @author rangga
 */
public class TryCatchFinally {
    
    public static void main(String[] handling){
    
    //mendeteksi ada kesalahan dalam block program
    try{
        //contoh kesalahan
        int a =  1/0;
        System.out.println(a);
        }
    //menangkap kesalahan yg terjadi di block try        
    catch (Exception ex){
        //pesan error asli
        ex.printStackTrace();
       //pesan error manual
        System.out.println("terjadi kesalahan");
    }
    //mengeksekusi program meskipun ada error / tidak        
    finally{
        System.out.println("program tetap berjalan");
    }
    
    }
    
}
