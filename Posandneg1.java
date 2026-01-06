package posandneg1;
import java.util.Scanner;
public class Posandneg1 {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);
System.out.println("Enter your num");
int x=n.nextInt();
if(x>0)
System.out.println("your num positive");
else if(x<0)
System.out.println("your num negative");
else
System.out.println("your num zero");

    }
    
}
