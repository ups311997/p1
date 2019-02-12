package com.stackroute;

public class Prog3 {
    public  String check(String n)
    {
        int i;
        int countv=0;
        int countc=0;
        char ch = '\u0000';
        for ( i=0;i<n.length();i++) {
            ch = n.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                countc++;
            } else {
                countv++;
            }
        }
            if(countc>0 && countv==0)
                return "vowel";
            else if(countv>0 && countc==0)
                return "consonant";
            else if (countv>0 && countc>0)
                return "vowel consonant";

        return "error";
    }
}
