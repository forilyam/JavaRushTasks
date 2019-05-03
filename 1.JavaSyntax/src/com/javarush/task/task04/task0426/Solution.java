package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        if (a>0 && a%2==0) System.out.println("положительное четное число");
        if (a>0 && a%2!=0) System.out.println("положительное нечетное число");
        if (a<0 && a%2!=0) System.out.println("отрицательное нечетное число");
        if (a<0 && a%2==0) System.out.println("отрицательное четное число");
        if (a==0) System.out.println("ноль");
    }
}
