package com.practice;

public class primer_number {

    public static void main(String args[]) {
        int d =7;
        IsPrimer(d);
    }

    public static void IsPrimer(int primer) {
        int i, m = 0, flag = 0;
        //int n = 17;// it is the number to be checked
        m = primer / 2;
        for (i = 2; i <= m; i++) {
            if (primer % i == 0) {
                System.out.println("Number is not prime");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(primer + " is prime");
    }

}
