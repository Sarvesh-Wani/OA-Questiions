import java.util.HashMap;
// Problem Description
// Given two arrays, score (an array of integers) and names (an array of strings representing candidate names), where each names[i] corresponds to a score[i]. Assume that 0≤i<n and n=score.size()=names.size(). Print the name of the candidate with the highest score.

// Input Format
// The first line contains an integer N, representing the length of the array (score and names).
// The second line contains N space-separated integers, representing score.
// The third line contains N space-separated strings, representing names.
// Output Format
// Print the name of the candidate with highest score.
public class TCS_OA7 {
    public static void main(String args[])
    {
        int n = 4;
        int score[] = {100,95,102,120};
        String names[] = {"Peter","John","Alice","Joe"};

        HashMap<Integer, String> mp = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            mp.put(score[i],names[i]);
        }

        int max = 0;
        for(int key : mp.keySet())
        {
            if(key > max)
            {
                max = key;
            }
        }
        System.out.println(mp.get(max));
    }
}
