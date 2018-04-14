
package test;


public class Test {

   
    void check(){
    
        int x,y=0,prime;
        
        for(int i =2;i<10000;i++){
        x=0;
            for(int j =2;j<=i/2;j++){
            
                if(i%j==0){
                    
                    x++;
                    break;
                }
                
            }
            
            if(x==0){
            
               prime = i;
                //System.out.println(prime);
               y++;
               
//               if(y==10001){
//               
//                   System.out.println(prime);
//                   return;
//               }
            }
        }
         System.out.println(y);
    }
    
    public static void main(String[] args) {
        
        Test t = new Test();
        t.check();
        
    }
    
}
