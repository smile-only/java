import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("m: ");
        long m=cin.nextLong();
        System.out.print("k: ");
        byte k=cin.nextByte();
        System.out.println((m>>k)%2);
    }
}