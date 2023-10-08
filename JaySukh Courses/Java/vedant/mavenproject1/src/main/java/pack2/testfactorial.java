/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;
import java.util.*;
import pack1.*;
/**
 *
 * @author Rutaben
 */
public class testfactorial 
{
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
	System.out.println("Enter any Number");
	int no=s.nextInt();
	factorial f1=new factorial();
	System.out.println("Factorial is "+f1.findfactorial(no));
    }
    
}
