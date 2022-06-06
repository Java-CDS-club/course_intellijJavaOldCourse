import java.util.Arrays;
import java.util.Scanner;

public class SortedArray
{
    private static Scanner scanner = new Scanner(System.in);
    public static int [] getIntegers(int count)
    {
        int[] array = new int[count];
        for (int i =0 ; i < count ; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int [] array)
    {
        for (int i = 0 ; i < array.length ; i++)
        {
            System.out.println("Element "+i + " contents "+ array[i]);
        }
    }
    public static int[] sortIntegers(int []array)
    {
        for (int i = 0 ; i < array.length-1; i++)
        {
            int flag = 0 ;
            for (int j = 0 ; j < array.length-1;j++)
            {
                if (array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] =temp;
                    flag =1;
                }
            }
            if (flag == 0 )
                break;
        }
        return array;
    }

}
