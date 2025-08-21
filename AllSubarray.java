import java.util.*;

public class AllSubarray {

    public static void printSubarray(int arr[])
    {
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            String subarray = "";
            for(int j=i; j<n; j++)
            {
                subarray += arr[j] + " ";
                System.out.println(subarray.trim());
            }
        }
    }

    public static void printSubarrayList(int arr[])
    {
        int n = arr.length;
        List<int[]> subarrays = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int sub[] = Arrays.copyOfRange(arr, i, j+1);
                subarrays.add(sub);
            }
        }
        for(int a[] : subarrays)
        {
            System.out.println(Arrays.toString(a));
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        
        printSubarray(arr);
        printSubarrayList(arr);

    }
}
