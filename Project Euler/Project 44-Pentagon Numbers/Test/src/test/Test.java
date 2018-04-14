
package test;

public class Test {

    void Ops(){
    
        long[] pent = new long[2500];
        long sub,total,x=0,min=1000000000;
        
        for(int i = 1;i<=2500;i++){
        
            pent[i-1] = (i*((3*i)-1))/2;
            //System.out.println(pent[i-1]);
        }
        
        for(int i =0;i<2500;i++){
        
            for(int j=i+1;j<2500;j++){
               
                sub=0;total=0;
                
                sub=pent[j]-pent[i];
                total = pent[j]+pent[i];
               // System.out.println(sub);
                
                for(int k=0;k<2500;k++){
                 
                if(sub==pent[k]){
                
                    for(int l=0;l<2500;l++){
                    
                        if(total==pent[l]){
                        
                            if(sub<min){
                            
                                min=sub;
                            }
                        }
                    }
                }
                     
                }
                
//                if(x==2){
//                
//                    if(sub<min){
//                    min=sub;
//                    x=0;
//                      //  System.out.println(min);
//                    }
//                
//                }
            
               
            }
        }
        System.out.println("---"+min+"---");
    }   
 
   
    public static void main(String[] args) {
       
        Test t =  new Test();
        t.Ops();
        
    }
    
}
