package com.stackroute;

public class Prog1 {
    public long pal(long p) {
        long sum = 0;
        long temp = p;

        long rem;
        long x = 0;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;


        }
        return sum;
    }




    public boolean addeven(long p) {
        long add = p;
        long rem;
        long x = 0;

        while (add > 0) {
            rem = add % 10;
            if (rem % 2 == 0) {
                x = x + rem;
            }
            add = add / 10;

        }
       if(x>25)
           return true;
       else
           return false;

    }

}
