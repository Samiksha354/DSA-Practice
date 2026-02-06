package Sorting_Algorithams;

import java.util.*;

public class SelectionSort {


    public static int  min_element(int[] arr, int size) {

        int min=Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }


    //selection sort just find the min element in array and swap it with first
    //next time the array will start from negleting or eliminating first
    //in selection sort we cant irectly use method to get minimum cause we
    // want minimum as well as its index
    //& method cannot retun 2 value at same time
    //it can return but it goes in complex DSA hence
    // find the min_element and it index in it ans later swap with first
    public static void SelectionSort(int[] arr, int size) {
        for(int i=0; i<size; i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i; j<size; j++) { // minnimum element an dits index
                if (arr[j] < min) {
                    min=arr[j];
                    mindx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }

        System.out.println("\nSorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    //find max eelement and swap with last index
    public static void SelectionSort2(int[] arr, int size) {
        for(int i=size-1; i>=0; i--)
        {
            int max=Integer.MIN_VALUE;
            int maxidx=-1;
            for(int j=i; j >=0; j--) { // max element and its index
                if (arr[j] > max) {
                    max=arr[j];
                    maxidx=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;
        }

        System.out.println("\nSorted Array: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    //two pointer technique having time complexity O(nlogn+n)=O(nlogn)
    //O(nlogn) for sorting array
    //O(n) for traversal
    public static void Sum_2Pair(int[] arr, int size) {
        Arrays.sort(arr);
        int target=9;
        int i=0;
        int j=size-1;
        while(i < j){
            int sum=arr[i]+arr[j];
            if(sum >target) j--;
            else if(sum < target ) i++;
            else {
                System.out.print("\n"+arr[i] +" "+arr[j]);
                j--;
                i++;
            }
        }



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter the size of the array:
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        //create new array
        int[] arr = new int[size];



        //taking elemnets of the array from user
        System.out.println("Enter the  array1 elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }





//       SelectionSort2( arr,  size);
 Sum_2Pair( arr,  size );



    }



}






