/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamental.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rangga
 */
class cobaMap{
    public String nama; 
}

public class CollectionMap {
    
    public static void main(String[] collecMap){
        
        Map<Object , String> mapObject = new HashMap<Object, String>();
        cobaMap cm = new cobaMap();
        cm.nama = "test";
        
        //mengambil nilai data < data awal> , <data perubahan>
        mapObject.put(cm.nama, "hbghjg"); 
                                                          //menerima nilai yang
                                                          //akan di ubah
        System.out.println("Nama Telah Di Ubah Menjadi "+ mapObject.get("test"));
        
    }
    
}
