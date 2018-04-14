
package test;
import java.math.BigInteger;

public class Test {

    
    public static void main(String[] args) {
        

         //BigInteger b1=new BigInteger("2");
        BigInteger a = BigInteger.valueOf(2);
        
        BigInteger result = a.pow(1000);
        
        System.out.println(result);
        
        String s = result.toString();
        
        int sum =0;
        
        for(int i = 0;i<s.length();i++){
        
            Character c =  s.charAt(i); 
            String h = c.toString();
            //System.out.println(c);
            int k = Integer.parseInt(h);
            sum +=k;
           
        }
         System.out.println(sum);

    }
    
}
