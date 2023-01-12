public class Main
{
    public static void main(String[] args)
    {
        int[] x=new int[] {832,387,633,388,213};
        float[] y=new float[] {4.0f,2.4f,1.9f,8.2f,7.2f};
        System.out.print("  x ");
        for(int i:x)
            System.out.print(" | "+i);
        System.out.print("\n-----|-----|-----|-----|-----|-----\n  y ");
        for(float i:y)
            System.out.print(" | "+i);
    }
}