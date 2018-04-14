
package test;
import java.math.BigInteger;

public class Test {

    void Ops(){
    
       long x =100;
        BigInteger result2 = BigInteger.valueOf(1);
        while(x!= (int)1){
        
           
            result2=result2.multiply(BigInteger.valueOf(x));
             // System.out.println(result2);
             x=x-1;
        }
        //System.out.println(result2);
        int total =0;
        String s = result2.toString();
        
        for(int i =0;i<s.length();i++){
        
            Character c = s.charAt(i);
            String k = c.toString();
            int num = Integer.parseInt(k);
            
            total+=num;
        }
        
        System.out.println(total);
        
            
        }
       
        

    
  
    public static void main(String[] args) {
      
        Test t = new Test();
        t.Ops();
}
}
    

