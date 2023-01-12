import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("a: ");
        double a=cin.nextDouble();
        System.out.print("b: ");
        double b=cin.nextDouble();
        System.out.print("c: ");
        double c=cin.nextDouble();
//        a=3;
//        b=3.5+3*Math.pow(2,-111);
//        c=3.5+3*Math.pow(2,-111);
        double P=a+b+c;
        double p=P/2;
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Perimeter: "+P);
        System.out.println("Area: "+S);
    }
}