/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Basic;

/**
 *
 * @author rangga
 */
public class OperatorAritmatika {
    
    public static void main (String[] aritmatika){
    
        int a = 10;
        int b = 5;
        
        System.out.println("hasil operator pertambahan "+(a+b));
        System.out.println("hasil operator pengurangan "+(a-b));
        System.out.println("hasil operator perkalian "+(a*b));
        System.out.println("hasil operator pembagian "+(a/b));
        System.out.println("hasil operator modulus "+(a%b));
        System.out.println("hasil operator perpangkatan "+Math.pow(a, b));
        
        System.out.println("\noperator unary ++ = "+ a++);
        System.out.println(a);
        System.out.println("operator unary ++ = "+ ++b);
        System.out.println(b);
        
    }
    
}
