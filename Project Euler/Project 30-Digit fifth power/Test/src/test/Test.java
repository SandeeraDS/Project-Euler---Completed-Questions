
package test;
import java.math.*;

public class Test {

   
    public static void main(String[] args) {
        
      int total =0;
        int sum = 0;
        for(int i = 2;i<1000000000;i++){
       
            int y;
            int num = i;
           
            while(i!=0){

                int x =(int) i%10;
                //System.out.println(x);
                 y = (int) Math.pow(x, 5);
                // System.out.println(y);
                sum+=y;
                //System.out.println(sum);
                 i = i/10;
            }
            
            if(sum==num){
                System.out.println(num);
                total+=num;
                System.out.println("Total : "+total);
            }
        i=num;
        sum =0;
        
        }
    }
    
}
