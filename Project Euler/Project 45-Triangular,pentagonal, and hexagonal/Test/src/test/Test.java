
package test;


public class Test {

    void Ops(){

        long[] tri  =  new long[1000000];
        long[] pen = new long[1000000];

        for(int i =0;i<1000000;i++){

            tri[i]=((i+1)*(i+2)/2);
            pen[i]=((i+1)*(3*(i+1)-1))/2;
            long vv=1234567890;
        }

        for(int i =0;i<1000000;i++){

            for(int j=0;j<1000000;j++){

                if(tri[i]==pen[j]){
                   
                    System.out.println(tri[i]);
                    int x =Ops2(tri[i]);
                    
                    if(x==1){
                        
                        
                    }
                }
            }
        }
            
    }
    
    int Ops2(long x){
        // System.out.println(x);
        for(int i=1;i<100000;i++){
        
            long y=i*((2*1)-1);
            if(y==x){
            return 1;
               
            }
        }
    return 0;
    }
   
    public static void main(String[] args) {
       Test t = new Test();
       t.Ops();
               
    }
    
}
