
package test;


public class Test {

  
    void Ops(){
    
        
        double sum;
        for(int a =1;a<500;a++){
        
            for(int b=1;b<500;b++){
            
                double c = Math.sqrt((a*a)+(b*b));
                
                sum = a+b+c;
                //System.out.println(sum);
               
                if(sum==1000){
                    long y = (long) (a*b*c);
                    System.out.println(y);
                    return;
                }
                
            }
        }
    
    }
    
    public static void main(String[] args) {
        
        Test t =  new Test();
        t.Ops();
    }
    
}
