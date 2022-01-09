package com.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
           //permutations("","abc");
        ArrayList<String> ans = permutationsList("","abc");
        System.out.println(ans);
    }
    public static void permutations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0 , i);
            String s = p.substring(i , p.length());
            permutations(f + ch + s,up.substring(1));
        }
    }

    //Returning output as an arraylist
    public static ArrayList<String> permutationsList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>(); //initialising list
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>(); //initialising list

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0 , i);
            String s = p.substring(i , p.length());
            ans.addAll(permutationsList(f + ch + s,up.substring(1)));
        }

        return ans;
    }

}
