package com.Strings;

public class comparison {
    public static void main(String[] args) {
        String name1 = new String("Mohit");
        String name2 = new String("Mohit");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        //to get the particular character at any index
        System.out.println(name1.charAt(2));
    }
}
