package utilities;

 public class MaxConsecutiveOnes
{
    private static int maxConsecutiveOnes(int x)
    {
        // Initialize result
        int count = 0;

        // Count the number of iterations to
        // reach x = 0.
        while (x!=0)
        {
            // This operation reduces length
            // of every sequence of 1s by one.
            x = (x & (x << 1));

            count++;
        }

        return count;
    }

    // Driver code
    public static void main(String strings[])
    {
        System.out.println(maxConsecutiveOnes(10110));
       // System.out.println(maxConsecutiveOnes(222));
    }
}
