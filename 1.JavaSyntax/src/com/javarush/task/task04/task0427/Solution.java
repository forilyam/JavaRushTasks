package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        if (a>=1 && a<=999) {
            if (a%2==0 && a<10) System.out.println("четное однозначное число");
            if (a%2!=0 && a<10) System.out.println("нечетное однозначное число");
            if (a%2==0 && a>=10 && a<100) System.out.println("четное двузначное число");
            if (a%2!=0 && a>=10 && a<100) System.out.println("нечетное двузначное число");
            if (a%2==0 && a>=100 && a<=999) System.out.println("четное трехзначное число");
            if (a%2!=0 && a>=100 && a<=999) System.out.println("нечетное трехзначное число");
        }


    }
}
