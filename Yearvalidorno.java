package yearvalidorno;
import java.util.Scanner;
public class Yearvalidorno {
public static void main(String[] args) {
Scanner i=new Scanner(System.in);  
System.out.println("Day is");
int x=i.nextInt();
System.out.println("Month is");
int y=i.nextInt();
System.out.println("Year is");
int z=i.nextInt();
if((x<=29&&y==2) && ((z%400==0)||(z%4==0&&z%100!=0)))
System.out.println("valid");
else if ((x<=30)&& (y==4||y==6||y==9||y==11))
System.out.println("valid");
else if ((x<=31)&& (y==1||y==3||y==5||y==7||y==8||y==10||y==12))
System.out.println("valid");
else
System.out.println("invalid");        
        
        
    }
    
}
