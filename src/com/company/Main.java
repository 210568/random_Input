package com.company;

import java.util.*;

public class Main {

//    定义静态变量以便判断
//        定义跳出循环中断标志符 EXIT_FLAG
//        定义错误中断标志符号 ERROR_FLAG

    final static int EXIT_FLAG = 0;
    final static int ERROR_FLAG = -1;

//    定义动态数组
static ArrayList<Float> numArrayList = new ArrayList<>();

    public static void main(String[] args) {
//        声明 Scanner 对象
        Scanner scanner = new Scanner(System.in);

//        定义所需变量
        int count = 0,avgCount = 0;
        float[] numberList = new float[0];
        float sum=0.0F,min,max,avg;

        System.out.print("请输入：");
        float number = scanner.nextFloat();

        while(number != EXIT_FLAG){
            if(number != ERROR_FLAG){
                numArrayList.add(number);
                count++;
                System.out.print("请输入：");
                number = scanner.nextInt();
            }else{
                System.out.println("输入出错！");
                System.out.print("请输入：");
                number = scanner.nextInt();
            }
            avgCount = count;
        }
//      计算最大最小值
        min = Collections.min(numArrayList);
        max = Collections.max(numArrayList);

//        计算和
        for (var i:numArrayList
             ) {
            sum+=numArrayList.get(--count);
        }
//        计算平均值
        avg = sum/avgCount;

//        输出最后结果

        System.out.println("和:"+sum);
        System.out.println("平均值:"+avg);
        System.out.println("最小值:"+min);
        System.out.println("最大值:"+max);
    }
}
