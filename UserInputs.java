package com.blz.address;

import java.util.Scanner;

public class UserInputs {
    static final Scanner sc = new Scanner(System.in);

    public static String stringNextValue(){
        return sc.next();
    }
    public static String stringNextLineValue(){
        return sc.nextLine();
    }
    public static int intValue(){
        return sc.nextInt();
    }
    public static long longValue(){
        return sc.nextLong();
    }
}
