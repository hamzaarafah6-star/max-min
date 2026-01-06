package maxandmin3;
import java.util.Scanner;
public class MaxandMin3 {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);        
System.out.println("Enter your num1");
double x=n.nextDouble();
System.out.println("Enter your num2");
double y=n.nextDouble();      
System.out.println("Enter your num3");
double z=n.nextDouble();
if((x>y)&&(x>z)&&(y>z))
System.out.println("num1 is"+x+"> num2 is"+y+"> num3 is"+z);    
else if((x>y)&&(x>z)&&(z>y))
System.out.println("num1 is"+x+"> num3 is"+z+"> num2 is"+y); 
else if ((y>x)&&(y>z)&&(z>x))   
System.out.println("num2 is"+y+"> num3 is"+z+">num1 is"+x);
else if ((y>x)&&(y>z)&&(x>z))   
System.out.println("num2 is"+y+"> num1 is"+x+"> num3 is"+z);
else if((z>x)&&(z>y)&&(x>y))
System.out.println("num3 is"+z+"> num1 is"+x+"> num3 is"+z);
else if((z>x)&&(z>y)&&(y>x))
System.out.println("num3 is"+z+"> num2 is"+y+"> num1 is"+x);
else
System.out.println("num1 is"+x+"= num2 is"+y+"= num3 is"+z);  
}
}
