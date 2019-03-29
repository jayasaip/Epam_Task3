package Rod_Cutting_Problem;
import java.util.*;
public class rodCuttingProblem {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tC = sc.nextInt();
        for(int t=0 ; t<tC ; t++)
        {
            int count = 1;
            int rodLength = sc.nextInt();
            while(Math.pow(2,count)-1<=rodLength)
            {
                count++;
            }
            System.out.println(count-2);
        }
    }

}
