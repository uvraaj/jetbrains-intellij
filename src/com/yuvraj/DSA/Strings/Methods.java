package com.yuvraj.DSA.Strings;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name = "Yuvraj Singh Guleria";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("    Yuvraj    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
