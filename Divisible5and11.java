package divisible5and11;
import java.util.Scanner;
public class Divisible5and11 {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);        
System.out.println("Enter your num");
int x=n.nextInt();
if ((x%5==0)&&(x%11==0))    
System.out.println("your num divisible by 5 and 11");
else
System.out.println("your num not divisible by 5 and 11");    
    }
    
}
