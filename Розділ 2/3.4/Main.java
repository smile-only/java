import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("a: ");
        int a=cin.nextInt();
        System.out.print("b: ");
        int b=cin.nextInt();
        System.out.print("c: ");
        int c=cin.nextInt();
        if(a==b)
            if(b==c)
                System.out.print(1);
            else
                System.out.print(2);
        else
            if(a==c)
                System.out.print(2);
            else
                if(b==c)
                    System.out.print(2);
                else
                    System.out.print(3);
    }
}