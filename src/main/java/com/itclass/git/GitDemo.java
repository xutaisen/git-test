package com.itclass.git;

import java.util.Scanner;

/**
 * @author: 徐泰森
 * @create: 2024-06-18 15:44
 **/
public class GitDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个大于零的数：");
        Scanner scanner = new Scanner(System.in);
       int i = scanner.nextInt();
        if (i>1){
            System.out.println("傻狗");
        }else {
            System.out.println("真聪明~~");
        }
    }
}