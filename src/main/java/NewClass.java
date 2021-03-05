/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
import java.util.Scanner;

public class NewClass {
    
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("enter the age: ");
    int age = scnr.nextInt();
   System.out.println(LifeInsurance(age));

  }

  public static int LifeInsurance(int age) {

    int lifeinsurence = 5 * age + 300;
    return lifeinsurence;
   
}
}