/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Exception;

/**
 *
 * @author rangga
 */
//handling error yg di buat secara manual
public class Throw {
    
    public static void main (String[]ex){
    
        try {
            throw new Exception("terjadi kesalahan");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
