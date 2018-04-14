
package test;


public class Test {

    int SumOfSqure(){
        int sum=0;
        for(int i =1 ;i<101;i++){
        
            sum = sum+(i*i);
            
            
        }
    
        return sum;
    }
    
    int SqureOfSum(){
    
        int sum =0;
        
        for(int i = 1;i<101;i++){
        
            sum = sum+i;
        }
        
        return sum*sum;
    }
   
    public static void main(String[] args) {
        
        Test t =  new Test();
        
        System.out.println(t.SqureOfSum()-t.SumOfSqure());
        
    }
    
}
