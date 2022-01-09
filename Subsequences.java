package com.Strings;

import java.sql.Array;
import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        System.out.println(subseqRet("","abc"));
    }
    public static void subseq(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }

        char ch= up.charAt(0);

        subseq(p + ch,up.substring(1)); //added
        subseq(p,up.substring(1)); //ignore
    }

    //Returning an array list
    static ArrayList<String> subseqRet(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>(); //making new list to store ans
            list.add(p); //processed will be our ans at our base condition bcoz up will be empty string
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));  //ans from left
        ArrayList<String> right = subseqRet(p, up.substring(1));  //ans from  right

        left.addAll(right); //total ans

        return left; //here we are combining both list and return, left conatins right also(above step),wee can return right too
    }
}
