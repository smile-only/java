public class Main
{
    public static void method(String s1,String s2)
    {
        System.out.println("s1==s2: "+(s1==s2));
        System.out.println("s1!=s2: "+(s1!=s2));
    }
    public static void main(String[] args)
    {
        String s1="1234",s2="1324";
        method(s1,s2);
        System.out.println("s1.equals(s2): "+s1.equals(s2));
    }
}