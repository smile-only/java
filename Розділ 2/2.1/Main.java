public class Main
{
    public static void main(String[] args)
    {
        int n1=0b10101010101;
        int n2=0b01010101010;
        System.out.println("~n1="+Integer.toBinaryString(~n1));
        System.out.println("~n2="+Integer.toBinaryString(~n2));
        System.out.println("n1&n2="+Integer.toBinaryString(n1&n2));
        System.out.println("n1|n2="+Integer.toBinaryString(n1|n2));
        System.out.println("n1^n2="+Integer.toBinaryString(n1^n2));
    }
}