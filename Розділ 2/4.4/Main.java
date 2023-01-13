import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("n: ");
        int n=cin.nextInt(),i=10;
        while (true)
        {
            if(i==100)
                break;
            System.out.print(i);
            i+=1;
            for (int q=1;q<n;q++)
            {
                if(i==100)
                    break;
                System.out.print(" "+i);
                i+=1;
            }
            System.out.print("\n");
        }
    }
}