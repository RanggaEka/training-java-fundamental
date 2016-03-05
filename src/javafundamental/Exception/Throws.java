/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Exception;

/**
 * @author rangga
 */
//digunakan dalam suatu method / class yg mungkin
//dapat menghasilkan error
public class Throws {
    
    public static void main (String[] throwss){
    
        try {
            error();
        } catch (Exception e) {
            System.out.println(e);
        }
            
    }
    
    public static void error() throws NullPointerException{
        //implementasi method
        throw  new NullPointerException();
    }
}
