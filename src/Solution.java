public class Solution {
    public int reverse(int x) {
        String string = String.valueOf(x);
        StringBuilder result = new StringBuilder();

        for (int i = string.length() - 1; i > 0; i--)
        {
            result.append(string.charAt(i));
        }

        char first = string.charAt(0);

        if ( first == 45 )
        {
            result.insert(0, first);
        } else {
            result.append(first);
        }

        if (Integer.MAX_VALUE < Long.parseLong(result.toString()) || Integer.MIN_VALUE > Long.parseLong(result.toString()))
        {
            return 0;
        } else {
            return Integer.parseInt(result.toString());
        }
    }
}
