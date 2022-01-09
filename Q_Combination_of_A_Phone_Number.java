package com.Strings;

import java.util.ArrayList;

public class Q_Combination_of_A_Phone_Number {
    public static void main(String[] args) {
        System.out.println(printCount("","12"));

    }
    public static void print(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }

        int digit = up.charAt(0) - '0' ; //this will convert '2' into 2

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++) {
             char ch = (char)('a' + i); //character to add

            print( p + ch , up.substring(1));
        }
    }

    //Returning an ArrayList
    public static ArrayList<String> printAsList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0' ; //this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>(); //whatever will get from rercursion put it here

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++) {
            char ch = (char)('a' + i); //character to add

             list.addAll(printAsList( p + ch , up.substring(1)));
        }
        return list;

    }

    //Count
    public static int  printCount(String p, String up)
    {
        if(up.isEmpty())
        {
           return 1;
        }
        int count=0;
        int digit = up.charAt(0) - '0' ; //this will convert '2' into 2

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++) {
            char ch = (char)('a' + i); //character to add

            count=count + printCount( p + ch , up.substring(1));
        }
        return count;
    }
}
