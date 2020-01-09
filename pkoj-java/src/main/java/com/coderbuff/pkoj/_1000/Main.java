package com.coderbuff.pkoj._1000;

import java.util.Scanner;

/**
 * Description
 *
 * 计算a加b。
 * Input
 *
 * 两个整数a和b，其中0≤a, b≤10。
 * Output
 *
 * 输出a与b的和。
 * Sample Input
 *
 * 1 2
 * Sample Output
 *
 * 3
 * @author okevin
 * @date 2020/1/9
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println(a+b);
    }
}
