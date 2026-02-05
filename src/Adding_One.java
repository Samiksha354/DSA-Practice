import java.util.*;
public class Adding_One {
    public static int adding_onee(int[] arr){
        return 0;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the siz of the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }

    }
}

//everytime you add a  code to here you have to run this commands so as to add this code to your repo

//git add .
//git commit -m "Added array rotation solution"
//git push