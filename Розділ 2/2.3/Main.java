public class Main
{
    public static void method(char c)
    {
        System.out.println("'"+c+"': "+Integer.toBinaryString((int) c));
    }
    public static void main(String[] args)
    {
        method('f');
        method('G');
        method('!');
        method('Q');
        method('a');
        method('ж');
        method(':');
    }
}