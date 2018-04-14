
package test;


public class Test {
    long max =0;
    void check(){
    
       String x,y;
       long max =0;
       // int[] y = new int[];
        for(int i=100;i<1000;i++){
        
            for(int j =100;j<1000;j++){
            
                x =Integer.toString(i*j);
               //System.out.println(x);
                y = new StringBuffer(x).reverse().toString();
                
                if(x.equals(y)){
                    System.out.println(i*j);
                    
                    if(max<(i*j)){
                    
                        max=i*j;
                    }
                }
                
                
            }
        }
        
      System.out.println(max);  
    
    }

    
    public static void main(String[] args) {
        
        Test t =  new Test();
        t.check();
        
        
        
    }
    
}
