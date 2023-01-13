import java.util.Date;
public class Main
{
    public static void main(String[] args)
    {
        Date d;
        int max=0;
        int last=0;
        for (long i=0;i<300000;i++)
        {
            d = new Date(i * 1000 * 3600 * 24);
            last+=1;
            if (d.getDay()==5 && d.getDate()==13)
            {
                if (last>max)
                    max=last;
                last=0;
            }
        }
        System.out.println(max);
    }
}