import java.util.*;
 
public class A_Anton_and_Letters
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
 
        String inp= sc.nextLine();
        inp = inp.substring(1,inp.length()-1);
        String str[] = inp.split(", ");
 
        if(str[0].equals(""))
            System.out.print(0);
        else
        {
            int count=0;
            Arrays.sort(str);
 
            for(int i=0;i<str.length-1;i++)
                if(!(str[i].equals(str[i+1])))
                    count++;
 
            System.out.print(count+1);
        }
    }
}