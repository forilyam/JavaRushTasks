package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = 0;
        int e = 0;
        if (a>0) d++;
        else if (a<0) e++;
        if (b>0) d++;
        else if (b<0) e++;
        if (c>0) d++;
        else if (c<0) e++;
        System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);

    }
}
