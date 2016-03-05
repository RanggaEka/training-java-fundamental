/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rangga
 */
class cobaList{
    public String nama;
}

public class CollectionList {
    
    public static void main(String[] list){
        
        cobaList cb = new cobaList();
        cb.nama = "Adi";
        
        
        //ambil data object
        List<cobaList> dataList = new ArrayList<cobaList>();
        
        System.out.println("List pertama -> ");
        dataList.add(cb);
        
        System.out.println("List kedua -> ");
        dataList.add(cb);                
        
        System.out.println("Jumlah List = " + dataList.size());
        
        for(cobaList data : dataList){
            System.out.println("isi list ->> "+ data.nama);
        }
        
    }
    
}
