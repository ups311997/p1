package com.stackroute;

public class Prog2 {
    public String check(int n)
    {
        if((n>=20)&&(n<=30)) {
            if (n % 2 == 0) {
                return "jerry";
            } else {
                return "tom";
            }

        }
        return "error";
    }
}
