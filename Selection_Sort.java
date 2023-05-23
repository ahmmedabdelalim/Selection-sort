import java.util.ArrayList;
import java.util.List;
public class Selection_Sort {


    public static  int find_smallest (int arr[])
    {
        int smallest = 0 ;
        int smallest_index = arr[0];

        for (int i = 1 ; i<= arr.length ; i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];

                smallest_index = i ;
            }
        }
        return smallest_index;
    }
    public  static void Selection_sort(int arr[])
    {
        List<Integer> new_arr = new ArrayList<>();
        int smallest_index;
        for(int i = 0 ; i<arr.length ; i++)
        {
            smallest_index = find_smallest(arr);
            new_arr.add(arr[smallest_index]);
        }
           System.out.println(new_arr);
    }
    public static void  main (String args[])
    {
        int arr[] = {2,4,3,9,8,1};
        Selection_sort(arr);
    }
}
