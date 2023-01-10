/*
In this section we will how to swap the largest element and smallest element in the given array :
____________________________________________________________________________________________________
Question : swap the largest and smallest element of array with each other :
____________________________________________________________________________
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GIVE THE VALUE TO SET THE VALUE OF ARRAY : ");
        int a = sc.nextInt();
        System.out.println("INSERT THE VALUE INSIDE ARRAY : ");
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(" " + arr[i]);
        }// LargestSwapping is initialized in other class and i call that class in main class.
        System.out.println();
        System.out.println("now printing the swapped value : ");
        LargestSwapping.swapping(arr);
    }
}