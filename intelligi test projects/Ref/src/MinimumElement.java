import java.util.Scanner;

public class MinimumElement
{
    public static int readInteger()
    {
        Scanner scanner  = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();
        return count;
    }
    public static int[] readElements(int c)
    {
        int []a = new int[c];
        Scanner scanner  = new Scanner(System.in);
        for (int i =  0 ; i < c  ; i++)
        {
            a[0] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return  a;
    }
    public static int finMin(int [] s)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < s.length ; i++ )
        {
            if (s[i] < min)
                min = s[i];
        }
        return min;
    }
}
