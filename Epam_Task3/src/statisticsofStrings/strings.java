package statisticsofStrings;
import java.util.*;

public class strings {
    static int n,a,mod;
    static ArrayList<String> comb=new ArrayList<String>();
    public static void main(String args[] ) throws Exception {
        
       Scanner s=new Scanner(System.in);
       
       n=s.nextInt();
       a=s.nextInt();
       mod=s.nextInt();
       
       dfs("");
       int count=0;
       for(String combination:comb){
           count=count+z(combination);
       }
       System.out.println(count%mod);
 
    }
    
    
    static void dfs(String curr){
        if(curr.length()==n){
            comb.add(curr);
            return;}
        for(int i=0;i<a;i++)
            dfs(curr+(char)('a'+i));
    }
    
    
    static int z(String str){
        
        char s[]=str.toCharArray();
        int [] z=new int[n];
        int max=0;
        
        for (int i = 1, l = 0, r = 0; i < n; ++i) {
            if (i <= r){
                z[i] = Math.min (r - i + 1, z[i - l]);
                max=Math.max(max,z[i]);
                
            }
            while (i + z[i] < n && s[z[i]] == s[i + z[i]]){
                ++z[i];
                max=Math.max(max,z[i]);
            }
            if (i + z[i] - 1 > r)
                l = i;
                r = i + z[i] - 1;
        }
        return max;
 
    }
}