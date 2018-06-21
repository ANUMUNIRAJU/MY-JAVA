import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
          int rev=0,rem;    
        int n=sc.nextInt();
        
        int n1=n;
        while(n!=0)
        {
        rem= n%10;
         rev=(rev*10)+rem;
         n=n/10;
        }
        System.out.println(rev);
    }
    
}
