import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int k = 0;
        int a = 1;
        int b = 1;
        
        System.out.print("1 1 ");
        
        while(k <= n)
        {
            k = a+b;
            
            if(k >= n)
            {
                break;
            }
            System.out.print(k + " ");
            a = b;
            b = k;
        }
    }
}
