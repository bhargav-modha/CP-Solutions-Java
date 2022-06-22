import java.util.Scanner;
 
public class A_Anton_and_Polyhedrons
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int face = 0;
 
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            switch(sc.next())
            {
            case "Tetrahedron":
                face += 4;
                break;
            case "Cube":
                face += 6;
                break;
            case "Octahedron":
                face += 8;
                break;
            case "Dodecahedron":
                face += 12;
                break;
            case "Icosahedron":
                face += 20;
                break;
            }
        }
        System.out.print(face);
    }
}