
package test;


public class Test {
    
      
    void check(){
    
       String x,y;
       long total =0;
       // int[] y = new int[];
        for(long i=1;i<1000000;i++){
        
           
            
                x =Integer.toString((int) i);
               //System.out.println(x);
                y = new StringBuffer(x).reverse().toString();
                
                if(x.equals(y)){
                    
                    
                    int cc= Ops1((int) i);
                    
                    if(cc==1){
                       // System.out.println(i);
                    total = total+i;
                    }
                }
                
                
            
        }
        
        System.out.println(total);
    
    }
    
    
    
    
    
    
    
    
    

    int Ops1(int x){
    
        String y;
       String s = Integer.toBinaryString(x);
       y = new StringBuffer(s).reverse().toString();
       Character c = y.charAt(0);
       
       String cc=c.toString();
       
       if(cc=="0"){
       
           return 0;
       }
       else{
       
       // y = new StringBuffer(s).reverse().toString();
        if(s.equals(y)){
        // System.out.println(y);
            //System.out.println(x);
            return 1;
        }
        else{
        
            return 0;
        }
       }
        //System.out.println(s);
    }
    
    public static void main(String[] args) {
        
        Test t = new Test();
        
        t.check();
    }
    
}
