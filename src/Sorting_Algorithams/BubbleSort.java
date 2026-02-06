package Sorting_Algorithams;

import java.util.*;

public class BubbleSort {

    //worst case we have to travel the
    // whole array even after some passes its sorted
    //***********time complexity O(n**2)
    //same for average case
    //size-1 is used cause it requies n-1 passes to check bubblesort
    public static void bubbleworst(int[] arr, int size){

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("\nSorted Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }



    }

    //here the worst case above is optimized
    //****************Time  Complexity=O(n)
    //this is done by checking if the array is
    // sorted or not before each pass this helps
    //to reduce time complexity i.e if the array is already
    //sorted then array will not work or algo not work,
    // work will get done in single run
    public static void bubblebest(int[] arr,int size){

        for(int i=0;i<size-1;i++){ // i for passess
            int swap=0; //how many swaap occurs
            for(int j=0;j<size-1-i;j++){ //for swaping in array j=1st element ,j+1=2nd element
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break; //if after a pass  swap don't occur's then break

        }
        System.out.println("\nSorted Array by Optimized code: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void bubblebest2(int[] arr,int size){

        for(int i=0;i<size-1;i++){ // i for passess
            //to check after a pass array is sorted or not if it is
            // then the loop will end
            //if not then it will continue
            boolean isSorted=true;
            for(int k=0;k<size-1;k++) {
                if (arr[k] > arr[k + 1]){
                    isSorted = false;
                     break;
                }
            }
            if(isSorted == true) break;

            for(int j=0;j<size-1-i;j++){ //for swaping in array j=1st element ,j+1=2nd element
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }


        }
        System.out.println("\nSorted Array by Optimized code using boolean variable: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void Reverse_Sorted(int[] arr,int size){

        for(int i=0;i<size-1;i++){ // i for passess
            int swap=0; //how many swaap occurs
            for(int j=0;j<size-1-i;j++){ //for swaping in array j=1st element ,j+1=2nd element
                if(arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break; //if after a pass  swap don't occur's then break

        }
        System.out.println("\nSorted Array Reverse: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }

    // move all zeros to end
    //the element be at same position
    //i.e arr= 0, 1, -2 ,3 ,0, 4 ,8 0, 10, 12
    //output=  1,-2 , 3 ,4 ,8,10 ,12 , 0, 0, 0
    public static void move_zero_to_end(int[] arr,int size){
        for(int i=0;i<size-1;i++){ // i for passess
            int swap=0; //how many swaap occurs
            for(int j=0;j<size-1-i;j++){ //for swaping in array j=1st element ,j+1=2nd element
                if(arr[j] == 0) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
             }
            if(swap==0) break;
        }
        System.out.println("\nSorted Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // more optimized sliding window or two pointer technique
    //
    public static void move_zero_to_end2(int[] arr,int size){
        int j=0;
        for(int i=0;i<size-1;i++){
            if(arr[i] != 0){
                if(i != j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }

        }
        System.out.println("\nSorted Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void addarr(int[] arr,int size , int[] arr2){
        int[] arrans=new int[size];
        for(int i=0; i<size; i++){
            arrans[i]=arr[i]+arr2[i];
            System.out.print(arrans[i]+" ");
        }
    }






    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Enter the size of the array:
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        //create new array
        int[] arr=new int[size];
        int[] arr2=new int[size];


        //taking elemnets of the array from user
        System.out.println("Enter the  array1 elements : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the  array2 elements : ");
        for(int i=0; i<size; i++){
            arr2[i]=sc.nextInt();
        }


//        bubbleworst(arr,size);
//        bubblebest(arr,size);
//        bubblebest2(arr,size);
//          Reverse_Sorted(arr,size);
//       move_zero_to_end(arr, size);
 //       move_zero_to_end2(arr, size);
  //      addarr(arr, size ,arr2);




    }
}
