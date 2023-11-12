/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.minggu11javacollection;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.PriorityQueue;
public class PriorityQueue2 {
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();  
  pq.add("Red");
  pq.add("Green");
  pq.add("Orange");
  pq.add("White");
  pq.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  // iterate the Priority Queue
  for (String element : pq) {
    System.out.println(element);
    }
 }
}

