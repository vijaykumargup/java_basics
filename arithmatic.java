import java.util.*;
public class arithmatic {
    public static void main(String args[]){
        Scanner nan=new Scanner(System.in);
        System.out.println("Enter the number of a=");
        int a=nan.nextInt();
        System.out.println("Enter Number of b=");
        int b=nan.nextInt();
        //sum operation 
        int sum=a+b;
        System.out.println(sum);
        //subtract opration
        int Sub=a-b;
        System.out.println(Sub);
        //Multiplication opration
        int Mul=a*b;
        System.out.println(Mul);
        //Divide operatin 
        int Div=a/b;
        System.out.println(Div);
        //remainder operation
        int rem=a%b;
        System.out.println(rem);
    }
    
}
