import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введіть ім\'я:");
        Scanner cin=new Scanner(System.in);
        String name=cin.nextLine();
        System.out.println("Привіт, "+name+"!");
    }
}