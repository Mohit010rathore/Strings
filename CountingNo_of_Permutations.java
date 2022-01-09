package com.Strings;

public class CountingNo_of_Permutations {
    public static void main(String[] args) {
       int ans=permutationsCount("","abc");
        System.out.println(ans);
    }
    public static int permutationsCount(String p, String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0 , i);
            String s = p.substring(i , p.length());
            count=count + permutationsCount(f + ch + s,up.substring(1));
        }
        return count;
    }
}
