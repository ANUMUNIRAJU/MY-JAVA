
import java.util.*;

public class JavaApplication1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []a=s.toCharArray();
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
        
    }
    
}
