import java.text.DecimalFormat;

class Solution {

    public void Learning(long arr[], long n) {
        int count1 = 0;
        float count2 = 0;
        int count3 = 0;
        float a;
        long b, c;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                count1++;
            else if (arr[i] > 0)
                count2++;
            else if (arr[i] == 0)
                count3++;
        }
        
        a = 10 / count2;
        b = 10 / count1;
        c = 10 / count3;

        // Create a DecimalFormat object to format the output to 5 decimal places
        DecimalFormat df = new DecimalFormat("0.00000");

        System.out.println(df.format(a));
        System.out.println(df.format(b));
        System.out.println(df.format(c));
    }

    public static void main(String[] args) {
        long N = 10;
        long A[] = new long[]{7, 7, 7, 7, 7, 7, -9, -9, -9, 0};

        Solution S = new Solution();
        S.Learning(A, N);
    }
}
