package sai.swaroop.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(7,"Sai");
        // Need to do a few things
        // 1. access the data members
        // 2. modify the data members
        obj.arr[0] =7; // This can be done but it's not secure
        System.out.println(obj.arr[0]);
        ArrayList<Integer> list = new ArrayList<>();
        obj.setNum(90);
        System.out.println(obj.getNum());
        int n = obj.getNum();

    }
}
