package com.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence_Duplicate {
    public static void main(String[] args) {
        int [] arr= {1,2,2};
        List<List<Integer>> ans = subsetDuplicates(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }
    public static List<List<Integer>> subsetDuplicates(int[] arr)
    {
        //sort the array
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>(); //outer list conatining many many list

        outer.add(new ArrayList<>()); //initially in outer list we have empty list
        int start = 0;
        int end = 0;

        for(int i=0; i< arr.length ; i++) //for every number in array
        {
            start = 0;
            //if current and previous element is same , s= e+1
            if(i > 0 && arr[i] == arr[i -1])
            {
                start = end +1;
            }
            end = outer.size() - 1;
            int n = outer.size(); //taking size of the array list items present,and add these numbers in the original list
            for (int j= start; j < n; j++) { //the no. of size the outer size is,that many list will be created
                List<Integer> internal = new ArrayList<>(outer.get(j)); //we can create the copy of ith list and we can add num in that list
                internal.add(arr[i]); //number will be added in original list...so we have to iterate through the original list
                outer.add(internal); //internal list is get added in the original list
            }
        }

        return outer;
    }
}
