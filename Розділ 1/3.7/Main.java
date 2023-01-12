public class Main
{
    public static void main(String[] args)
    {
        //Тут вказані дані Землі та Місяця
        double G=6.673E-11;
        double m_1=5.9722E24;
        double m_2=7.3477E22;
        double r=3.84467E8;
        System.out.println("F="+G*m_1*m_2/r/r);
    }
}