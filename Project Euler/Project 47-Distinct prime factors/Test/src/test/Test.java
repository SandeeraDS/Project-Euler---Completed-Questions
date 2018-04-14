
package test;


public class Test {

    
    int[] Ops1(){
        //include all primes in to a array;;;
        int x,y=0;
        int[] prime = new int[1229];
        
        for(int i =2;i<10000;i++){
        x=0;
            for(int j =2;j<=i/2;j++){
            
                if(i%j==0){
                    
                    x++;
                    break;
                }
                
            }
            
            if(x==0){
            
              prime[y]=i;
               y++;
            }
        }
        //System.out.println(y);
        return prime;
    }
    
    int[] Ops2(int[] x){
        
      
         int[] storethrees = new int[1000000];int z=0;
        for(int i=1000;i<1000000;i++){
        
            int j=0,value =0,valuecount=0;
           
            int num = i;
            while(i!=0){
            
                if(i%x[j]==0){
                    
                i=i/x[j]; //find the prime diviors;
                    //System.out.println(x[j]);
                if(value!=x[j]){
                value=x[j];
                valuecount++;// get the number of  distinct prime divisors;
                }
                j=0;
               
                }
                else{
                
                    j++;
                    if(j==1228){
                    break;
                    }
                }
                
               
            }
           // System.out.println(num+" ----> "+valuecount);
            
            if(valuecount==4){
            
                storethrees[z]=num;
                z++;
            }
            
        i=num;
            //System.out.println("----------");
        }
    
    return storethrees;
    }
    
    void Ops3(int[] storednNums){
        
        for(int i =0;i<storednNums.length;i++){
        
            if(storednNums[i]==0){
            
                System.out.println("Array is over");
                break;
            }
            if(storednNums[i+1]==storednNums[i]+1 && storednNums[i+2]==storednNums[i]+2 && storednNums[i+3]==storednNums[i]+3){
                System.out.println(storednNums[i]);
                return;
            }
        }
    
    }
    public static void main(String[] args) {
        
        Test t =  new Test();
        
       t.Ops3( t.Ops2(t.Ops1()));
       
    }
    
}
