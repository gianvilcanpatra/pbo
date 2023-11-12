/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.minggu11javacollection;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.*;  
public class HashMap1 {  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Red");
  hash_map.put(2, "Green");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Blue");
  for(Map.Entry x:hash_map.entrySet()){  
   System.out.println(x.getKey()+" "+x.getValue());  
  }  
 }  
}

