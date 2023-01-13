import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("n: ");
        int n=cin.nextInt();
        if (n>=128)
            n=((n-128)<<1)+1;
        else
            n=n<<1;
        System.out.print(n);
    }
}