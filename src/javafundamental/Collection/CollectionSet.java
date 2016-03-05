/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rangga
 */
class cobaSet{
    public String nilai;
}

public class CollectionSet {
    
    public static void main(String[] args) throws IOException {
        cobaSet cobas = new cobaSet();
        cobaSet cobasA = new cobaSet();
        //property untuk inputstream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //untuk menset sebuah nilai
        Set<String> setString = new HashSet<String>();
        
        System.out.println("tambah list 1: ");
        cobas.nilai = br.readLine();
        setString.add(cobas.nilai);
        
        System.out.println("tambah list 2: ");
        cobasA.nilai = br.readLine();
        setString.add(cobasA.nilai);
        
        System.out.println("Jumlah List -> "+ setString.size());
        for(String set : setString){
            System.out.println("isi ->> " + set);
        }
        
    }
    
}
