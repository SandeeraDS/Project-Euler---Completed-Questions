
package test;


public class Test {

    void check(){
        int x,y=0,maxcount=0,k=0;long result=0;
        
        long[] z = new long[1000000];

            for(long i =2;i<1000000;i++){
            x=0;
                for(long j =2;j<i;j++){

                    if(i%j==0){

                        x++;
                        break;
                    }

                }

                if(x==0){

                   z[k]=i;
               //   System.out.println(z[k]);
                   
                        long sum=0;int count=0;
                        for(int m=0;m<k;m++){
                            //System.out.println("xxxxxx"+z[m]);
                            sum=sum+z[m];
                            count++;
                            if(sum==z[k]){

                              System.out.println(z[k]+" count of "+count);break;
                            }
                            else if(sum>z[k]){
                                
                                int count2=0;
                                
                                for(int l = 0;l<k;l++){
                                    sum = sum-z[l];
                                    count2++;
                                    
                                    if(sum ==z[k]){
                                        count-=count2;
                                    System.out.println(z[k]+" count of "+(count));break;
                                    }
                                   
                                    else if(sum<z[k]/2){
                                    break;
                                    }
                                
                                }
                                
                                break;
                            }
                         }
//                        if(count>maxcount){
//                        maxcount = count;
//                        result=z[k];
//                        }
                       //System.out.println("---------------------------");
                  k++;
                   
                }
            
           
                

            
      }  
           // System.out.println(result+" with count of"+maxcount);  
        //  for(int i = 0;i<z.length;i++){
//                
//                if(z[i]==0){
//                break;
//                }
//                
//                System.out.println(z[i]);
//            }
    }
    public static void main(String[] args) {
        
        Test t =  new Test();
        t.check();
        
    }
    
}
