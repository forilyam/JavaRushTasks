package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        float summ = 0;
        float sred = 0;
        int m = 1;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String n = reader.readLine();
            int number = Integer.parseInt(n);
            if (number != -1) {
                summ = summ + number;
                m++;
                sred = summ / (m - 1);
            }
            else break;
        }
        System.out.println(sred);
    }
}

