//Gretest of all numbers//
import java.util.Scanner;
public class D1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        Greatest(n1,n2,n3);
        sc.close();
    }
    public static void Greatest(int n1,int n2,int n3){
        if(n1>n2 && n1>n3)
            System.out.println("Graeter Value is"+n1);
        else if(n2>n3)
            System.out.println("Graeter Value is "+n2);
        else
            System.out.println("Greater value is"+n3);
    }
}