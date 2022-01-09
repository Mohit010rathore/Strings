package com.Strings;

import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        System.out.println("a" + 1);
        //integer will be converted to integer that will call toString()

        System.out.println((char)('a' + 1));
        System.out.println("Kunal" + new ArrayList<>());
        //System.out.println("Kunal" + new Integer(22));
        //u can only use operators with primitives and all the complex objects as well,
        //the only condition is atleast one of these objects should be of type string

        //System.out.println(new Integer(34) + "" + new ArrayList());
    }
}
