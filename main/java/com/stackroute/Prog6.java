package com.stackroute;

public class Prog6 {
    public String check(char c)
    {
        if(c >= 97 && c <= 123)
        {
            return "small letter";

        }
        else if(c >= 65 && c <= 96) {
           return "capital letter";
        }
        else if(c>=48 && c<=57){
            return "digit";
        }
        else {
            return "special symbol";
        }
    }
}
