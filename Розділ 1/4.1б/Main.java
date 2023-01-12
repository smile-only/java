import java.util.Scanner;
public class Main
{
    public static double f(double x)
    {
        if(x==1)
            return 5;
        double x5=x*x;
        x5=x5*x5;
        x5*=x;
        return (x5-1)/(x-1);
    }
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("x: ");
        double x=cin.nextDouble();
        System.out.println("y="+f(x));
    }
}