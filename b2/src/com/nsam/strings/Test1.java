package com.nsam.strings;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //mutable strings
        StringBuffer s1=new StringBuffer("Batch2");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("batchb3");
        System.out.println(s2);
        //insert,replace(),delete(),reverse(),append()
        s2.append("NSAM");
        System.out.println(s2);
        s2.insert(2,"ABDJ");
        System.out.println(s2);
        s2.replace(3,6,"xyz");
        System.out.println(s2);
        s2.delete(1,5);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);
      //immutable strings-2ways create
        //type-1declaration
        String x="Java";
        String y="Java";
        System.out.println(x==y);
        String p=new String("Java");
        String q=new String("Java");
        System.out.println(p==q);
        String z="XXXXXXXXXXX";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf('R'));
        System.out.println(z.lastIndexOf('R'));
        String a="nsam";
        String b="Nsam";
        System.out.println(a.equalsIgnoreCase(b));
        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));




    }
}
