package com.stackroute;


import java.util.Arrays;

public class SortedWords {
    public String sortWords(String s1)
    {
        //s1=s1.toLowerCase();
        String [] arr=s1.toLowerCase().split(" ",0);

        String str="";
        for(int i=0;i<arr.length;i++)
        {
            char []c=arr[i].toCharArray();
            Arrays.sort(c);
            arr[i]= new String(c);
            System.out.println(arr[i]);
            str= str + arr[i] + " ";
        }


        str=str.trim();
        return  str;
    }
}
