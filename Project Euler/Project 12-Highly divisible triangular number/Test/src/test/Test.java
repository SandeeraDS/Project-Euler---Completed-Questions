
package test;


public class Test {

    void Ops(){
    
        long TriNum;
                int count;
        
        for(Long i =12000L;;i++){
            
            TriNum=0L;
            count =2;
            for(Long j=1L;j<=i;j++){
            
                TriNum=TriNum+j;
            }
            System.out.print(TriNum);
            for(int l=2;l<=TriNum/2;l++){
            
                if(TriNum%l==0){
                
                    count++;
                   
                }
            }
             System.out.print("==="+count);
                    System.out.println("");
            if(count>500){
            
                System.out.println(TriNum);
                return;
            }
        }
    }
  
    public static void main(String[] args) {
        
        Test t =  new Test();
        t.Ops();
        
    }
    
}
