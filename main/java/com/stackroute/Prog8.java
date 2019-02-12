package com.stackroute;

public class Prog8 {
    public String check(int n)
    {
        int low=20;

        int high=70;
        while (true) {
            if (n >= low && n <= high) {
                return "guess is right";

            } else if (n < low) {
                return "Number guessed is less than original number";

            } else if (n > high) {
                return "Number guessed is greater than original number";

            }
        }
    }
}
