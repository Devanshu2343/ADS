// A program in java to find number of digit in a number 
/*
 * Test Case :: 6501 => 4
 * 0101 => 4
 * null=> 0
 */

import java.util.*;
public class NumberOfDigit {
    private static int count (int n ){
        if (n==0){
            return 0;
        }
        return 1+ count(n/10);

      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        if (n==0 ){
            System.out.println(1);
        }
        else {
            int digit = count(Math.abs(n));
            System.out.println(digit);
        }

    }
    
}
