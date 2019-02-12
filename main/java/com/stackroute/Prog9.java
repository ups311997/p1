package com.stackroute;

public class Prog9 {
    public String rev(String str1){
        {



            String str2 = "";

            for (int i=str1.length()-1; i>=0; i--) {
                str2 += str1.charAt(i);
            }

            return (str2);

        }
    }
}
