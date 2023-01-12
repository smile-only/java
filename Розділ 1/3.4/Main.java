import java.lang.Math;
import java.math.BigDecimal;
public class Main
{
    public static void main(String[] args)
    {
        //float
        float fval1=(float)Math.pow(10,-4);
        float fval2=(float)2.33E5;
        float fval3=(float)Math.PI;
        float fval4=(float)Math.E;
        float fval5=(float)Math.sqrt(5);
        float fval6=(float)Math.log(100);
        //double
        double dval1=Math.pow(10,-4);
        double dval2=2.33E5;
        double dval3=Math.PI;
        double dval4=Math.E;
        double dval5=Math.sqrt(5);
        double dval6=Math.log(100);
        //BigDecimal
        BigDecimal bval1=BigDecimal.valueOf(Math.pow(10,-4));
        BigDecimal bval2=BigDecimal.valueOf(2.33E5);
        BigDecimal bval3=BigDecimal.valueOf(Math.PI);
        BigDecimal bval4=BigDecimal.valueOf(Math.E);
        BigDecimal bval5=BigDecimal.valueOf(Math.sqrt(5));
        BigDecimal bval6=BigDecimal.valueOf(Math.log(100));
    }
}