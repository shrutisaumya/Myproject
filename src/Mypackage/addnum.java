/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.util.Scanner;

/**
 *
 * @author Shruti
 */
public class addnum {
    
private double x;
private double y;
	
    private static double add(double x, double y) {
		return (x + y);
    }


 public static void main(String[] args) {
     
 double fn=0,sn=0;
 Scanner input = new Scanner(System.in);
 
 try{
 System.out.println("Enter First Number: ");
 fn=input.nextDouble();
 System.out.println("Enter Second Number: ");
 sn=input.nextDouble();
 }
 catch(Exception ex){
     System.out.println(ex.toString());
 }
 
 System.out.println("Sum of the nos. is:" + add(fn,sn));
 }
}
 