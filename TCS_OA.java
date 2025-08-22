public class TCS_OA{
    public static void main(String args[])
    {

        int arr[] = {2, 3, 1, 5};
        int n = arr.length;

        n = n+1; // expected
        
        int total = (n*(n+1)) / 2;

        int sum = 0;
        for(int el : arr)
        {
            sum += el;
        }

        System.out.println(total - sum);
    }
}