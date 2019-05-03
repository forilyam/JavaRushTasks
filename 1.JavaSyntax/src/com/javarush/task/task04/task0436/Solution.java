package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m1 = reader.readLine();
        String n1 = reader.readLine();
        int m = Integer.parseInt(m1);
        int n = Integer.parseInt(n1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                System.out.print(8);
            }
            System.out.println(8);

        }
    }
}
