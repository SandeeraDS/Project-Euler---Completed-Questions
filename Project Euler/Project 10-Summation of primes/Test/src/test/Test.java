
package test;


public class Test {
    void Ops(){
    
        int x,y; long sum=0L;
        
        for(int i = 2;i<2000000;i++){
        
            x=0;
            
            for(int j=2;j<=i/2;j++){
            
                if(i%j==0){
                
                    x++;
                    break;
                }
                
            }
            
            if(x==0){
            System.out.println(i);
                sum = sum+i;
            }
            
        }
        System.out.println(" ");
        System.out.println("/n/nThe sum is : "+sum);
    
    }

    
    public static void main(String[] args) {
        
        Test  t =  new Test();
        t.Ops();
    }
    
}
