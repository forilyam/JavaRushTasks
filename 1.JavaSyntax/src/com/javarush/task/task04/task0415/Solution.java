package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        if (((n1+n2)>n3) && ((n2+n3)>n1) && ((n1+n3)>n2)) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}