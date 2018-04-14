
package test1;
import java.math.BigInteger;


public class Test1 {

    void Ops(){

        String[] tri  =  new String[1000000];
        String[] pen = new String[1000000];

        for(int i =0;i<1000000;i++){
            
            BigInteger n=BigInteger.valueOf(i);
            BigInteger con1 = BigInteger.valueOf(i+1);
            BigInteger con2 = BigInteger.valueOf(2);
            
            BigInteger tri_res = n.multiply((con1.divide(con2)));
            tri[i]=tri_res.toString();
            
              con1 = BigInteger.valueOf((3*i)-1);
            
            BigInteger pene_res =n.multiply(con1.divide(con2));
            pen[i]=pene_res.toString();
           
        }

        for(int i =286;i<1000000;i++){

            for(int j=167;j<1000000;j++){

                if(tri[i].equals(pen[j])){
                   
                    System.out.println("---"+tri[i]+"----");
                   int x =Ops2(tri[i]);
                    
                    if(x==1){
                        
                        System.out.println(tri[i]); 
                        return;
                    }
                }
            }
        }
            
    }
    
    int Ops2(String x){
        // System.out.println(x);
        for(int i=1;i<100000;i++){
            
            BigInteger n=BigInteger.valueOf(i);
            BigInteger con1 = BigInteger.valueOf(2);
            BigInteger con2 = BigInteger.valueOf(1);
            
            BigInteger hex = n.multiply((con1.multiply(n)).subtract(con2));
            
            if(hex.toString().equals(x)){
            return 1;
               
            }
        }
    return 0;
    }
   
    public static void main(String[] args) {
       Test1 t = new Test1();
       t.Ops();
               
    }
    
}
