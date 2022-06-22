import java.util.Scanner;
 
public class A_Linear_Keyboard
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int t = sc.nextInt();
        char alpha[] = new char[26];
 
            while(sc.hasNext())
            {
                String temp = sc.next();
            for(int j=0;j<26;j++)
            {
                alpha[j] = temp.charAt(j);    
            }
            String word = sc.next();
            int positions[] = new int[word.length()];
            
            for(int j=0;j<word.length();j++)
            {
                for(int k=0;k<26;k++)
                {
                    if(word.charAt(j) == alpha[k])
                    {
                        positions[j] = k;
                    }
                }
            }
            sum = 0;
            for(int z=0;z<positions.length-1;z++)
            {
                sum += Math.abs(positions[z]-positions[z+1]);
            }
 
            System.out.println(sum);
            }
    }
}