package com.coderbuff.pkoj._1001;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Description
 *
 * 对数值很大、精度很高的数进行高精度计算是一类十分常见的问题。比如，对国债进行计算就是属于这类问题。
 *
 * 现在要你解决的问题是：对一个实数R( 0.0 < R < 99.999 )，要求写程序精确计算 R 的 n 次方(Rn)，其中n 是整数并且 0 < n <= 25。
 * Input
 *
 * T输入包括多组 R 和 n。 R 的值占第 1 到第 6 列，n 的值占第 8 和第 9 列。
 * Output
 *
 * 对于每组输入，要求输出一行，该行包含精确的 R 的 n 次方。输出需要去掉前导的 0 后不要的 0 。如果输出是整数，不要输出小数点。
 * Sample Input
 *
 * 95.123 12
 * 0.4321 20
 * 5.1234 15
 * 6.7592  9
 * 98.999 10
 * 1.0100 12
 * Sample Output
 *
 * 548815620517731830194541.899025343415715973535967221869852721
 * .00000005148554641076956121994511276767154838481760200726351203835429763013462401
 * 43992025569.928573701266488041146654993318703707511666295476720493953024
 * 29448126.764121021618164430206909037173276672
 * 90429072743629540498.107596019456651774561044010001
 * 1.126825030131969720661201
 * @author okevin
 * @date 2020/1/9
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigDecimal result = cin.nextBigDecimal();
        Integer seq = cin.nextInt();
        System.out.println(result);
        System.out.println(seq);
    }
}
