package com.stackroute;

public class Prog10 {
    public String rep(String str1,int n)
    {




        char sub;
        String str2="";
        for (int i=0;i<n;i++)
        {
            for (int j=str1.length()-n;j<str1.length(); j++) {
                sub=str1.charAt(j);
                str2= str2+sub;
            }

        }return (str1+str2);
    }
}

