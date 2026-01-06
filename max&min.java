package javaapplication30;
import java.util.Scanner;
public class JavaApplication30 {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);        
System.out.println("Enter your num1");
double x=n.nextDouble();
System.out.println("Enter your num2");
double y=n.nextDouble();      
if(x>y)
System.out.println("num1 is"+x+"> num2 is"+y);    
else if (x<y)   
System.out.println("num1 is"+x+"< num2 is"+y);
else
System.out.println("num1 is"+x+"= num2 is"+y);  
}
    
}