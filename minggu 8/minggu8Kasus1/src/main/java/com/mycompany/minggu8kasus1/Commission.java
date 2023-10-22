/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu8kasus1;

/**
 *
 * @author Gian Vilcan Patra
 */


public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phoneNumber, String socialSecurityNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phoneNumber, socialSecurityNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPay = super.pay(); // Call the pay method of the parent class to get the hourly pay
        double commissionPay = totalSales * commissionRate;
        totalSales = 0; // Reset total sales
        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        String parentToString = super.toString(); // Call the toString method of the parent class
        return parentToString + "\nTotal Sales: $" + totalSales;
    }
}
