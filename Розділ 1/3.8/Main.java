import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        float x=cin.nextFloat();
        //Без використання Math
        if(x>0)
            System.out.println((x-x%1)+" "+x%1);
        else if(x%1==0)
            System.out.println(x+" "+0.0);
        else
            System.out.println((x-1-x%1)+" "+(1+x%1));
        //Використовуючи Math
        System.out.println(Math.floor(x)+" "+(x-Math.floor(x)));
    }
}