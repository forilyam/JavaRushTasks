package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int g;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        if (n%400 == 0) g = 366;
        else {
            if (n%100 == 0) g = 365;
            else {
                if (n%4 == 0) g = 366;
                else g = 365;
            }
        }
        System.out.println("количество дней в году: " + g);
    }
}