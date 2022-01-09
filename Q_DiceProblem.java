package com.Strings;

import java.util.ArrayList;

public class Q_DiceProblem {
    public static void main(String[] args) {
        //System.out.println(dice_List("",4));
        diceFace("",4,7);
    }
    public static void dice(String p, int target)
    {
        if(target == 0)
        {
            System.out.println(p);
            return ;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
             dice(p+i , target - i);
        }
    }

    //returning a list
    public static ArrayList<String> dice_List(String p, int target)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            list.addAll(dice_List(p+i , target - i));
        }
        return list;
    }

    public static void diceFace(String p, int target,int face)
    {
        if(target == 0)
        {
            System.out.println(p);
            return ;
        }

        for (int i = 1; i <= face && i <= target ; i++) {
            diceFace(p+i , target - i,face);
        }
    }
}
