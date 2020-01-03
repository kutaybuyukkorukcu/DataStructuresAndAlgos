// Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this subarray makes the whole array sorted.

// Exp.
/*
1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
your program should be able to find that the subarray lies between the indexes 3 and 8.

2) If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50],
your program should be able to find that the subarray lies between the indexes 2 and 5.
*/

public class MinLengthArray 
{ 
	static void printUnsorted(int arr[], int n) { 
    
        int f = 0, l = n-1, i, max, min; 

        for (f = 0; f < n - 1; f++) { 
            if (arr[f] > arr[f + 1]) 
                break; 
        } 

        if (f == n-1) { 
            System.out.println("Array is already sorted!"); 
            return; 
        } 

        for(l = n - 1; l > 0; l--) { 
            if(arr[l] < arr[l - 1]) 
            break; 
        } 

        max = arr[f];
        min = arr[f];
        
        for(i = f + 1; i <= l; i++) { 
            if(arr[i] > max) 
                max = arr[i]; 
            if(arr[i] < min) 
                min = arr[i]; 
        } 

        for( i = 0; i < f; i++) { 
            if(arr[i] > min) { 
                f = i; 
                break; 
            }	 
        } 

        for( i = n - 1; i >= l + 1; i--) { 
            if(arr[i] < max) { 
                l = i; 
                break; 
            } 
        } 

        System.out.println("[" + s + " " + e "]");
	} 
		
	public static void main(String args[]) { 
    
        int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}; 
        printUnsorted(arr, arr.length); 
	} 
} 
