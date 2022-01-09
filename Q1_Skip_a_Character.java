package com.Strings;

public class Q1_Skip_a_Character {
    public static void main(String[] args) {
        String ans = skipAppNotApple("bacapplcda");
        System.out.println(ans);

    }
    //Approach-1 : Pass the string in argument
    static void skipRecursive(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        //first char in every function call
        char ch= up.charAt(0);

        if(ch == 'a')
        {
            //skip
            skipRecursive(p,up.substring(1)); //we will skip the a and we will we will take the substring from index 1
        }else{
            skipRecursive(p + ch,up.substring(1));
        }
    }
    //Approach-2:  Create the answer variable in function body
    static String skipRecursive(String up)
    {
        if(up.isEmpty())
        {
            return " "; //will return empty string---BASE Condition
        }
        //first char in every function call
        char ch= up.charAt(0);

        if(ch == 'a')
        {
            //skip
            return skipRecursive(up.substring(1)); //we will skip the a and we will we will take the substring from index 1
        }else{
            return ch + skipRecursive(up.substring(1));
        }
    }

    //skipping a string
    static String skipString(String up)
    {
        if(up.isEmpty())
        {
            return " "; //will return empty string---BASE Condition
        }

        if(up.startsWith("mohit"))
        {
            //skip
            return skipString(up.substring(5)); //we will skip the a and we will we will take the substring from index 1
        }else{
            return up.charAt(0) + skipString(up.substring(1));
        }
    }

    static String skipAppNotApple(String up)
    {
        if(up.isEmpty())
        {
            return " "; //will return empty string---BASE Condition
        }

        if(up.startsWith("app") && !up.startsWith("aaple"))
        {
            //skip
            return skipAppNotApple(up.substring(3)); //we will skip the a and we will we will take the substring from index 1
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
