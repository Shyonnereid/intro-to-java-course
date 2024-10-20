package com.cbfacademy;

import com.cbfacademy.sort.ArraySorter;

public class BinarySearch implements ArraySorter {

 @Override
    public void sort(int[] arr, int startIndex, int endIndex) {
        
    }

    // Implementing binary search method
    public int binarySearch(int[] arr, int first, int last, int key) {
        while (first <= last) {
            int mid = (first + last) / 2; // Find the middle index

            if (arr[mid] == key) {
                return mid; // Key found at index mid
            } else if (arr[mid] < key) {
                first = mid + 1; // Search in the right half
            } else {
                last = mid - 1; // Search in the left half
            }
        }

        return -1; // Key not found
    }
    
}
