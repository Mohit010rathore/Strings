package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class Iterative_Subsequence {
    public static void main(String[] args) {
       int[] arr={1,2,3};
       List<List<Integer>> ans = subset(arr);
       for(List<Integer> list : ans){
           System.out.println(list);
       }
    }
    public static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>(); //outer list conatining many many list

        outer.add(new ArrayList<>()); //initially in outer list we have empty list

        for(int num:arr) //for every number in array
        {
            int n = outer.size(); //taking size of the array list items present,and add these numbers in the original list
            for (int i = 0; i < n; i++) { //the no. of size the outer size is,that many list will be created
                List<Integer> internal = new ArrayList<>(outer.get(i)); //we can create the copy of ith list and we can add num in that list
                internal.add(num); //number will be added in original list...so we have to iterate through the original list
                outer.add(internal); //internal list is get added in the original list
            }
        }

        return outer;
    }
}
