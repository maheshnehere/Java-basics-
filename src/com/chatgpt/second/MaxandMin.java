package com.chatgpt.second;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,7,8,8,6,5,889,9};
//        int temp = 0;
//        for (int i = 0;i< arr.length;i++)
//        {
//            temp+=i;
//
//            if (temp < i)
//            {
//
//            }
        Arrays.sort(arr);

        System.out.println("Min :"+arr[0]);
        System.out.println("Max :"+arr[arr.length-1]);
    }
    }

