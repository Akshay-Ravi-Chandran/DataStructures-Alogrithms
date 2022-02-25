package com.arrays;

public class Traversal_Search {

    static void search(int[] arr, int ele){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                System.out.println("Element Found!");
                return;
            }
        }
        System.out.println("Element not found!");
    }

    static void traverse(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7};
        search(arr,10);
        traverse(arr);

    }

}
