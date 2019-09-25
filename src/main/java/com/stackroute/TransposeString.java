package com.stackroute;

public class TransposeString {

    public String transpose(String str)
    {
        String str1[]= str.split(" ",0);
        String str2="";
        for(int i=0;i<str1.length;i++)
        {
            char []c= str1[i].toCharArray();

            int l1=c.length;
            char []c1= new char[l1];
            str2="";
            for(int j=0;j<l1;j++)
            {

                c1[j]=c[(l1-j)-1];
                str2=str2+c1[j];

            }

            str1[i]=str2;

        }
        int l2=str1.length;
        String str3="";
        for(int i=0;i<l2;i++)
        {
            str3=str3+str1[i]+" ";

        }
        str3=str3.trim();
        return str3;
    }

}