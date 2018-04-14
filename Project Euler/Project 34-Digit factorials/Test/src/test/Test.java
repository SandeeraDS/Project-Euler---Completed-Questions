
package test;

public class Test {

    void Ops(){
    
        int total = 0;
        for(int i =3;i<1000000000;i++){
            
            int sum=0;
            int num = i;
            while(i!=0){
            int facto=1;
                int check =i%10;
                
                for(int j=check;j>1;j--){
                
                    facto=j*facto;
                    
                    
                }
               // System.out.println(facto);
                sum=sum+facto;
                i=i/10;
            }
            
            if(num==sum){
            
                System.out.println("this is curious number : "+num);
                total+=num;
            }
            i=num;
        }
        System.out.println("");
        System.out.println("the total of curious number : "+total);
    }
    
   
    public static void main(String[] args) {
       
        Test t =  new Test();
        
        t.Ops();
        
        
    }
    
}
