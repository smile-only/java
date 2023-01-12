import java.util.Scanner;
public class Main
{
    public static double f(double x)
    {
        double res=x*x;
        res+=1;
        return res*res;
    }
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("x: ");
        double x=cin.nextDouble();
        System.out.println("y="+f(x));
    }
}