import java.util.Random;
public class Main
{
    public static int alice()
    {
        Random rnd=new Random();
        int last_num=rnd.nextInt(2),new_num=rnd.nextInt(2);
        int result=2;
        while (last_num==0 || new_num==0)
        {
            result+=1;
            last_num=new_num;
            new_num=rnd.nextInt(2);
        }
        return result;
    }
    public static int bob()
    {
        Random rnd=new Random();
        int last_num=rnd.nextInt(2),new_num=rnd.nextInt(2);
        int result=2;
        while (last_num==0 || new_num==1)
        {
            result+=1;
            last_num=new_num;
            new_num=rnd.nextInt(2);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Random rnd=new Random();
        double a=0,b=0;
        for(long i=0;i<100000000;i++)
        {
            if(alice()<bob())
                a+=1;
            else
                b+=1;
        }
        System.out.println(a/(a+b));
    }
}