
package test;


public class Test {

    void Ops(){
    
        int max=0;long num2=0L,num1;
        
        for(long x=1l;x<1000000;x++){
            
            int count=1;
            num1=x;
            while(x!=1){

                if(x%2==0){

                    x=x/2;
                    count++;
                }
                else{
                x=3*x+1;
                count++;
                }
            }
            System.out.println("count : "+count);
            if(count>max){
            
                max=count;
               // System.out.println(count);
                num2=num1;
            }
            x=num1;
        }      
        System.out.println("----->"+max);
        System.out.println("----->"+num2);
    }
    
    public static void main(String[] args) {
        
        Test t =  new Test();
        
        t.Ops();
                
       
    }
    
}
