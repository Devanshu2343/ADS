/*
 * Number of even element in the array
 */

public class NumberOfEvenElement {

  private static void countEven(int[] arr, int i, int c, int n) {
    if (i == n) {
        System.out.println(c);
        return;
    }

    if (arr[i] % 2 == 0) {
        countEven(arr, i + 1, c + 1, n);  
    } else {
        countEven(arr, i + 1, c, n);
    }
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int n = arr.length;
    int c = 0;
    
    countEven(arr, 0, c, n);
}   

}




