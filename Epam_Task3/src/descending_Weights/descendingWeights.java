package descending_Weights;
import java.util.*;


public class descendingWeights {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k= s.nextInt();
         
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<k;i++){
            bucket.add(i,new ArrayList<>());
            
        }       
        for (int i = 0; i < n; i++) {
            int number=s.nextInt();
            int temp=number;
            number=number%k;
            bucket.get(number).add(temp);
         } 
        
        for(int i=0;i<k;i++){
            ArrayList<Integer> get = bucket.get(i);
            Collections.sort(get);
            
        
        }
        
         for(int i=k-1;i>=0;i--){
             int length=bucket.get(i).size();
             
            for(int j=0;j<length;j++){
                System.out.print(bucket.get(i).get(j)+" ");
            }
         
        }
    }
}
