package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n, m;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);
        //if ((n1 == n2) && (n2 == n3) && (n3 == n4)) System.out.println(n1);
        if (n1 <= n2) n = n2;
        else n = n1;
        if (n3 <= n4) m = n4;
        else m = n3;
        if (n < m) System.out.println(m);
        else System.out.println(n);
    }
}
