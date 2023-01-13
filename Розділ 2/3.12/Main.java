import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("First rectangle");
        System.out.print("x1: ");
        int x1_1=cin.nextInt();
        System.out.print("y1: ");
        int y1_1=cin.nextInt();
        System.out.print("x2: ");
        int x1_2=cin.nextInt();
        System.out.print("y2: ");
        int y1_2=cin.nextInt();
        System.out.println("Second rectangle");
        System.out.print("x1: ");
        int x2_1=cin.nextInt();
        System.out.print("y1: ");
        int y2_1=cin.nextInt();
        System.out.print("x2: ");
        int x2_2=cin.nextInt();
        System.out.print("y2: ");
        int y2_2=cin.nextInt();
        int[] x=new int[] {x1_1,x1_2,x2_1,x2_2};
        int[] y=new int[] {y1_1,y1_2,y2_1,y2_2};
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.printf("(%d,%d), (%d,%d)\n",x[1],y[1],x[2],y[2]);
    }
}