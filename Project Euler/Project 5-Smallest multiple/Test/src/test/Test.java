
package test;


public class Test {
    
    void check(){
    
       for(int i =11;;i++){
       int x=0;
           for(int j=2;j<21;j++){
           
               if(i%j!=0){
                   x++;
               break;
               }
               
               
           }
           
           if(x==0){
           System.out.println(i);
               return;
           }
       }
     
        
    }

   
    public static void main(String[] args) {
        
        Test t = new Test();
        
        t.check();
       
    }
    
}
