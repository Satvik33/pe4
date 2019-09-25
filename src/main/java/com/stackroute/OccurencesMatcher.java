package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurencesMatcher {


    public String matchOccurence(String str1, String str2){
        String str3="";

        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);


        while(matcher.find()) {
            System.out.println("Found at: "
                    + matcher.start() + " - " + matcher.end()+", ");
            str3=str3+("Found at: "
                    + matcher.start() + " - " + matcher.end()+", ");
        }

        str3=str3.trim();
        return str3;
    }
}