/**
 * A class to practice common data structures and algorithms
 */

package myLibrary.DataStructures.Arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void traverse(int[] arr){
        for (int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void insert(int[] arr, int indexInsert, int newNum) throws NullPointerException, IndexOutOfBoundsException{
        if (arr == null) {
            throw new NullPointerException("Array is empty");
        }

        if (indexInsert < 0 || indexInsert >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i=arr.length-1; i>indexInsert; i--) arr[i] = arr[i - 1];
        arr[indexInsert] = newNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayOperations.insert(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }
}
