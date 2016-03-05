/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Basic;

/**
 *
 * @author rangga
 */


public class BreakContinueReturn {
    
    public static void main(String[] args){
        
        String[] members = {"Indah","Oky","Budi"};
        
        //break
        for(int i=0; i < members.length;i++){
            System.out.println(members[i]);
            if(members[i].equals("Indah")) break;
        }
        System.out.println("Looping selesai");
        
         //continue
        for(int i=0; i < members.length;i++){
            if(members[i].equals("Indah")) continue;
            System.out.println(members[i]);
        }
        System.out.println("Looping selesai");
        
        //return
        for(int i=0; i < members.length;i++){
            System.out.println(members[i]);
            if(members[i].equals("Indah")) return;
        }
        System.out.println("Looping selesai");
        
        
    }
    
}
