import java.util.*;
 
public class A_Remove_Smallest
{
    public static void main(String Args[])
    {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
 
             while(t-- >0)
            { 
                int length = sc.nextInt();
                int elements[] = new int[length];
 
                for(int j=0;j<length;j++)
                    elements[j] = sc.nextInt();
 
                Arrays.sort(elements);
                System.out.println(Evaluate(elements));
            }
 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
 
    private static String Evaluate(int[] elements)
    {
        for(int j=0;j<elements.length-1;j++)
            {
                if(elements[j+1]-elements[j] > 1)
                {
                    return("NO");
                }
            }
        return("YES");
    }
}