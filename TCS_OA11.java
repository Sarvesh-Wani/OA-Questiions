public class TCS_OA11 {

    public static void main(String args[])
    {
        int x = 25;
        int y = 4;

        int floor = (x/y); // 6.25 -- > 6
        int lower = floor * y; // 24 

        int ciel = (x + y - 1)/y; // 7
        int higher = ciel * y; // 28 

        // lower - x - higher

        if(x - lower <= higher - x)
        {
            System.out.println(lower);
        }else{
            System.out.println(higher);
        }
    }
    
}
