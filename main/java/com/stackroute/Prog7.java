package com.stackroute;

public class Prog7 {
    public String sort(int a[], int n) {
        int i;
        int temp;


        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int add=0;
        for ( i=0;i<n;i++)
        {
            if (a[i]%2==0)
            {
                add=add+a[i];
            }
        }

        if(add>15)
        {
            return "true";
        }
        else {
            return "false";
        }

    }
}

