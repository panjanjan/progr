import java.math.BigInteger;

public class DN1{
    public static void main(String[] arg){
        int a = 869;
        BigInteger b = new BigInteger("85");

        for(int i = 0; i < a; i++) {
            System.out.println(b);
            b = b.multiply(BigInteger.valueOf(2));
        }
    }
}