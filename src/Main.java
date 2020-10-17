import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BigInteger a= BigInteger.valueOf(1);
        for(int i = 1; i<1001; i++) {
            //BigInteger b= BigInteger.valueOf(a);
            a = a.multiply(BigInteger.valueOf(2));
            System.out.println(i + " " + a);
        }
        BigInteger s= BigInteger.valueOf(0);
        for(int i=301; i>-1; i--){
            BigInteger z= BigInteger.valueOf(1);
            for(int q=i; q>0;q--)
                z = z.multiply(BigInteger.valueOf(10));
            s= s.add((a.divide(z)));
            System.out.println(a);
            a=a.remainder(z);
            //a= a-Math.pow(10, i);
            //System.out.println(Math.pow(10, i));
        }
        System.out.println(s);

    }

}
