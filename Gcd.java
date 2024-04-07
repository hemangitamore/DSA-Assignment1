//Greatest common division
import java.util.Scanner;
public class Gcd{

   public static int gcd(int a,int b){
     if(a==0){
     return b;
     }
     if(b==0){
     return a;
    }

    if(a==b){
    return a;
    }
    
   if(a>b){
    if(a%b==0){
    return b;
}
return gcd(a-b,b);
}
 if(b%a==0){
return a;
}
return gcd(a,b-a);
}



  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println(" gcd of "+ a +" and "+ b +" is "+gcd(a,b));
    
}
}