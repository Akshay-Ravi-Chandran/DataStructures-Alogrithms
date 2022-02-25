package com.arrays;

public class LargestElement {

    static int findLargest(int[] arr){

        int largest = arr[0];
        for(int ele : arr){
            if(ele > largest) largest = ele;
        }
        return largest;

    }

    public static void main(String[] args) {

        int arr[] = {10,40,30,25,50,15,35};
        System.out.println(findLargest(arr));

    }

}
