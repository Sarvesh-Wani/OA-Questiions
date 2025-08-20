import java.util.HashMap;

public class TCS_OA4 {

    public static int UniqueSum(int arr[])
    {
        int sum = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int el : arr)
        {
            mp.put(el, mp.getOrDefault(el, 0)+1);
        }

        for(int key : mp.keySet())
        {
            if(mp.get(key) == 1)
            {
                sum += key;
            }
        }

        return sum;
    }

    
    public static void main(String args[])
    {
        int arr[] = {1,5,3,4,1,3,2}; //11
        System.out.println(UniqueSum(arr));
    }
}
