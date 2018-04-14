    
package test;


class Fibo{

    int check(){
        
        int sum=2,k=2,l=1,total=0;
          while(sum<4000000){
        
            //System.out.println(sum);
              
            if(sum%2==0){
                total =total+sum;
            }
            
            sum = l+k;
            l=k;
            k=sum;
            
            
        }
        
        return total;
    }
    
    
}

public class Test {


    public static void main(String[] args) {
        
        Fibo f = new Fibo();
        //f.check();
        System.out.println(f.check());
       
    }
    
}
