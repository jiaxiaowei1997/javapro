package com.Neuedu.pr;

import com.Neuedu.s1.MyArray;

/**
 * Create by Jia on 2020/2/5/005 16:06
 */
public class MyTest5 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        for(int i=1;i<=100;i++){
            myArray.add(i);
        }
        for(int i=0;i<myArray.getSize();i++){
            System.out.println(myArray.get(i));
        }

    }
}
