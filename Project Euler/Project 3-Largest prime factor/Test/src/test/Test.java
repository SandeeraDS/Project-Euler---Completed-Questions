
package test;


public class Test {
    
    void prime(){
    
       long x  =600851475143L;
        
        int test=0;
        
        for(int i = 2;i<=x/2;i++){
        
            if(x%i==0){
            
                for(int j=2;j<=i/2;j++){
                
                    if(i%j==0){
                        test++;
                        break;
                    }
                     
                }
                if(test==0){
                
                    System.out.println(i);
                }
            
            } 
            
        }
    
    }

   
    public static void main(String[] args) {
        
        Test t = new Test();
        
        t.prime();
        
    }
    
}
