import java.util.*;

public class glowingBulbs {
    static char[] cha;
    static ArrayList<Integer> num;
    static long check(long mid){
        long res=0;
        for(int i=1;i<Math.pow(2,num.size());i++){
            int ch=i;int index=0;int pro=1;int inc=0;
            while(ch!=0){
                if((ch&1)>0){
                    pro=pro*num.get(index);
                    inc++;
                }
                    index++;ch=ch>>1;
            }
            
                if(inc%2==0)
                    res-=mid/pro;
                    else res+=mid/pro;
        }
        return res;
    }
    public static void main(String args[] ) throws Exception {
        
    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt();
    while(true){
        if(count==0)break;count--;
        cha=sc.next().toCharArray();
        int k=sc.nextInt();
        num=new ArrayList<Integer>();
        for(int i=0;i<cha.length;i++)
        if(cha[i]=='1')
        num.add(i+1);
        
        
        long result=0;
        long low=1,high=(long)Math.pow(10,15);
        high=37*high;
        while(low<=high){
             long mid=(low+high)/2;
             long val=check(mid);
            if(val>=k)
            {
                result=mid;
                high=mid-1;}
            else low=mid+1;
        }
                System.out.println(result);
        
    }
    }
    
}