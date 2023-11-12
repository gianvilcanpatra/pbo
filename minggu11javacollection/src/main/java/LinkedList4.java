/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList4 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
        // print original list
   System.out.println("Original linked list:" + l_list);  
 
    Iterator it = l_list.descendingIterator();

     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}

