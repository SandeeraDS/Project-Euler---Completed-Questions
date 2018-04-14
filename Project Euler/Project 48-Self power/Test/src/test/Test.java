
package test;
import java.math.BigInteger;

public class Test {

    void Ops(){
    
        BigInteger sum = BigInteger.valueOf(0);
        for(int i = 1 ;i<1001;i++){
        
            BigInteger num = BigInteger.valueOf(i);
            
            BigInteger power=num.pow(i);
            sum=sum.add(power);
        
        }
        
        //System.out.println(sum);
        String s = sum.toString();
        String num1 = s.substring(s.length()-10, s.length());
        System.out.println(num1);
    
    }
    
    public static void main(String[] args) {
        
        Test t =  new Test();
        
        t.Ops();
       
    }
    
}
