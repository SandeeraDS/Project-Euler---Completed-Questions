
package test;


public class Test {

    void Ops1(){
    int total = 0;
        for(int i =2;i<10000;i++){
            int sum=0;
            for(int j=1;j<=i/2;j++){
            
                if(i%j==0){
                
                   sum +=j;
                }
            
            }
            int sum2 = Ops2(sum);
            
            if(sum2==i){
            
                //System.out.println(i+" and "+sum);
                if(i!=sum)
                total +=i+sum;
            }
        }
        System.out.println(total/2);
    }
    
    int Ops2(int x){
    
        int sum=0;
        for(int i =1;i<=x/2;i++){
        
            if(x%i==0){
            
                sum+=i;
                
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
       
        Test t = new Test();
        
        t.Ops1();
    }
    
}
