import java.util.Scanner;
public class Main
{
    public static int func(int x)
    {
        char[] s=Integer.toBinaryString(x).toCharArray();
        int result=0;
        for(int i=1;i<s.length;i++)
            if (s[i]=='1' && s[i-1]=='1')
                result+=1;
        return result;
    }
    public static void main(String[] args)
    {
        int num=0b11110111;
        System.out.println(func(num));
    }
}