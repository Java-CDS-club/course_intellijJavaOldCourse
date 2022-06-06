import java.util.Arrays;

public class ReverseArray
{
    private static void reverse(int [] array)
    {
        int i = 0 ;
        int  j = array.length-1;
        System.out.println("array = " + Arrays.toString(array));
        while (i <= j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
