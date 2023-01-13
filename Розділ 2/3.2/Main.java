import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd=new Random();
        int new_num,last_num=rnd.nextInt(10);
        System.out.println(last_num);
        for(int i=1;i<25;i++)
        {
            new_num=rnd.nextInt(10);
            if(new_num<last_num)
                System.out.println(new_num+" smaller then last");
            else if(new_num>last_num)
                System.out.println(new_num+" bigger then last");
            else
                System.out.println(new_num+" equal to last");
            last_num=new_num;
        }
    }
}