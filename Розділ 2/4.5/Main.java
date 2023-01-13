import java.util.Scanner;
public class Main
{
    public static String prob(int i)
    {
        if (i<10)
            return "  ";
        else if (i<100)
            return " ";
        else
            return "";
    }
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("n: ");
        int n=cin.nextInt(),i=1;
        while (true)
        {
            if(i==1000)
                break;
            System.out.print(prob(i)+i);
            i+=1;
            for (int q=1;q<n;q++)
            {
                if(i==1000)
                    break;
                System.out.print(" "+prob(i)+i);
                i+=1;
            }
            System.out.print("\n");
        }
    }
}