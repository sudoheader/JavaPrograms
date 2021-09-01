package com.sudoheader.java;

import java.util.Objects;

public class InterviewAnswers {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
//        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(Objects.equals(str1.hashCode(), str2.hashCode()));
        System.out.println(str1.hashCode() == str3.hashCode());
        System.out.println(Objects.equals(str1.hashCode(), str3.hashCode()));
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());


    }
}
