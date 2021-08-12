package com.shangguigu.java;

/**
 * @author shkstart
 * @create 2021-08-10 20:36
 */
public class Temple {

    public static void main(String[] args) {
        // sout
        System.out.println();
        // soutp
        System.out.println("args = [" + args + "]");
        // soutm
        System.out.println("Temple.main");
        // soutv
        int num1 = 10;
        System.out.println("num1 = " + num1);
        // xxx.sout
        int num2 = 20;
        System.out.println(num2);

        // fori
        String[] arr = new String[]{"tom", "jerry"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        // iter
        for (String s : arr) {
        }
        // itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

    }
}
