/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Shruti
 */
import java.io.*;
import java.util.*;

public class revstring {
 
    public static void main(String[] args) {
    String input = "abcdef";
    char[] temparr= input.toCharArray();
    int i=0,j=0;
    char temp;
    j=temparr.length-1;
    while(i<j)
    {
     
     temp = temparr[i];
     temparr[i] = temparr[j];
     temparr[j]=temp;
     i++;
     j--;
    }
    for (char c : temparr)
     System.out.print(c);
    System.out.println();
   }   
}
