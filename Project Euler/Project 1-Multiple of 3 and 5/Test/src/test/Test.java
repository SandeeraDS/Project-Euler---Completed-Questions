
package test;


class Ops{

    int sum=0;
    void check(){
    
        for(int i = 0;i<1000;i++){
            
            if(i%3==0 || i%5==0){
               // System.out.println(i);
                sum = sum+i;
                
            }
    
       }
        System.out.println(sum);
    }

}

public class Test {

   
    public static void main(String[] args) {
        
        Ops o = new Ops();
        
        o.check();
        
       
    }
    
}
