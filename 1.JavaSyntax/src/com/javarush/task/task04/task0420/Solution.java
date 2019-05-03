package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        if (a==b && b==c) System.out.print(a + " " + b + " " + c);
        else {
            if (a > b && b > c) System.out.print(a + " " + b + " " + c);
            if (a > b && c > b && a > c) System.out.print(a + " " + c + " " + b);
            if (b > a && a > c) System.out.print(b + " " + a + " " + c);
            if (b > a && c > a && b > c) System.out.print(b + " " + c + " " + a);
            if (c > b && b > a) System.out.print(c + " " + b + " " + a);
            if (c > b && a > b && c > a) System.out.print(c + " " + a + " " + b);
            if (a==b && a>c) System.out.print(a + " " + b + " " + c);
            if (a==b && c>a) System.out.print(c + " " + b + " " + a);
            if (a==c && b>c) System.out.print(b + " " + a + " " + c);
            if (a==c && c>b) System.out.print(a + " " + c + " " + b);
            if (b==c && c>a) System.out.print(b + " " + c + " " + a);
            if (b==c && a>b) System.out.print(a + " " + c + " " + b);
        }
    }
}
