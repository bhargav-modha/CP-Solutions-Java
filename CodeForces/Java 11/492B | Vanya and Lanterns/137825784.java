import java.util.*;
 
public class B_Vanya_and_Lanterns
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int n, l, r;
        n = sc.nextInt();
        l = sc.nextInt();
        int p[] = new int[n];
 
        for(int i=0;i<n;i++) p[i]=sc.nextInt();
 
        Arrays.sort(p);        
        r = Math.max(p[0], l-p[n-1])*2;
 
        for(int i=0;i<n-1;i++)
            r = Math.max(r,p[i+1]-p[i]);
 
        System.out.println(String.format("%.10f", r/2.0));
    }
}