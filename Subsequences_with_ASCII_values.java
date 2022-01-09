package com.Strings;

import java.util.ArrayList;

public class Subsequences_with_ASCII_values {
    public static void main(String[] args) {
        //subseqAscii("","abc");
        System.out.println(subseqAscii2("","abc"));

    }
    public static void subseqAscii(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }

        char ch= up.charAt(0);

        subseqAscii(p + ch,up.substring(1)); //added
        subseqAscii(p,up.substring(1)); //ignore
        subseqAscii(p + (ch +0) , up.substring(1)); //in this take take ascii value
    }

    //Returning an array list
    static ArrayList<String> subseqAscii2(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>(); //making new list to store ans
            list.add(p); //processed will be our ans at our base condition bcoz up will be empty string
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqAscii2(p + ch, up.substring(1));  //ans from left
        ArrayList<String> right = subseqAscii2(p, up.substring(1));  //ans from  right
        ArrayList<String> middle = subseqAscii2(p + (ch+0) , up.substring(1));

        left.addAll(right); //total ans
        left.addAll(middle);

        return left; //here we are combining both list and return, left conatins right also(above step),wee can return right too
    }
}
