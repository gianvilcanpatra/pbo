/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu8kasus1;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Volunteer extends StaffMember
{
   //----------------------------------------------------------
   //  Constructor: Sets up this volunteer using the specified
   //  information.
   //----------------------------------------------------------
   public Volunteer (String eName, String eAddress, 
                     String ePhone)
   {
      super (eName, eAddress, ePhone);
   }

   //----------------------------------------------------------
   //  Returns a zero pay value for this volunteer.
   //----------------------------------------------------------
   public double pay()
   {
      return 0.0;
   }
}

