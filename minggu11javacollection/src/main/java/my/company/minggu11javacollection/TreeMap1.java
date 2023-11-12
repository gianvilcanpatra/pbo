package my.company.minggu11javacollection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.*;  
public class TreeMap1 {  
  public static void main(String args[]){  
   // Create a tree map
   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
  // Put elements to the map 
  tree_map.put(1, "Red");
  tree_map.put(2, "Green");
  tree_map.put(3, "Black");
  tree_map.put(4, "White");
  tree_map.put(5, "Blue");
    
   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
   {
    System.out.println(entry.getKey() + "=>" + entry.getValue());
   }
 }  
}

