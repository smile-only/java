import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("First string");
        String s1=cin.nextLine();
        System.out.println("Second string");
        String s2=cin.nextLine();
        if(s1.equals(s2))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}