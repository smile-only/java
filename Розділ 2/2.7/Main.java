import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("n: ");
        int n=cin.nextInt();
        System.out.print("i: ");
        int i=cin.nextInt();
        System.out.print((n%(1<<i))+((n>>(i+1)<<i)));
    }
}