public class Main
{
    public static void main(String[] args)
    {
        int i=0b101110000100110010111111101111;
        while(i>0)
        {
            System.out.println(Integer.toBinaryString(i));
            i=i>>1;
        }
    }
}