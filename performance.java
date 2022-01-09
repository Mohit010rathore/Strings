package com.Strings;

public class performance {
    public static void main(String[] args) {
        String series="";
        for (int i=0;i< 26; i++)
        {
            char ch=(char)('a' + i);
            System.out.println(ch);
            series=series + ch;
        }
        System.out.println(series);

        //can we create a sort of datatype that is actually not creating new object
        // but actually adding in their original objects --"STRING BUILDERS"
    }



}
