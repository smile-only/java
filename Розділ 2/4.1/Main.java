import java.util.Scanner;
public class Main
{
    public static int gcd(int x,int y)
    {
        while (x!=0 && y!=0)
        {
            if (x>y)
                x%=y;
            else
                y%=x;
        }
        return x+y;
    }
    public static String div(int p,int q)
    {
        int d=gcd(p,q);
        p/=d;
        q/=d;
        String result=p/q+".";
        p%=q;
        int five=0,qf=q;
        while (qf%5==0){five+=1;qf/=5;}
        int two=0,qt=q;
        while (qt%2==0){two+=1;qt/=2;}
        int mft;
        if (five>two)
            mft=five;
        else
            mft=two;
        for (int i=0;i<mft;i++)
        {
            p*=10;
            result+=p/q;
            p%=q;
        }
        int qtf=q;
        while (qtf%2==0){qtf/=2;}
        while (qtf%5==0){qtf/=5;}
        int l=1;
        while (Math.pow(10,l)%qtf!=1)
            l+=1;
        result+="(";
        for (int i=0;i<l;i++)
        {
            p*=10;
            result+=p/q;
            p%=q;
        }
        return result+")";
    }
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("p: ");
        int p=cin.nextInt();
        System.out.print("q: ");
        int q=cin.nextInt();
        System.out.println(p+"/"+q+"="+div(p,q));
    }
}