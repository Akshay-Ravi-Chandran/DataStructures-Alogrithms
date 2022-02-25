package com.arrays;

import java.util.*;

public class Insertion_Deletion {

    static int[] insert(int arr[], int capacity, int index, int element){

        if(index == capacity) {
            System.out.println("The array is full!");
            return arr;
        }
        else{
            if(index == arr.length - 1) arr[index] = element;
            else{
                for(int i = arr.length - 1; i >= index; i--){
                    arr[i+1] = arr[i];
                }
                arr[index] = element;
            }
        }
        return arr;
    }

    static int delete(int[] arr, int element){

        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element) {
                index = i;
                break;
            }
        }

        for(int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        return arr.length-1;

    }

    public static void main(String[] args) {

        int arr[] =  {1,2,3,4,5};
        int capacity = arr.length;
        insert(arr,capacity,4,6);
        System.out.println(Arrays.toString(arr));
        int n = delete(arr,3);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
