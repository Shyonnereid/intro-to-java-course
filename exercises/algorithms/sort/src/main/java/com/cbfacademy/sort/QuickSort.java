package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {

    @Override
    public void sort(int[] arr, int startIndex, int endIndex) {
        // Call the quickSort method to sort the array
        quickSort(arr, startIndex, endIndex);
    }

    // Implement the quickSort method
    private void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, startIndex, endIndex);
            
            // Recursively sort elements before and after partition
            quickSort(arr, startIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIndex);
        }
    }

    // Implement the partition method
    private int partition(int[] arr, int startIndex, int endIndex) {
        // Choose the pivot as the last element in the current sub-array
        int pivot = arr[endIndex];
        
        // Index of the smaller element and indicates the right position of pivot found so far
        int boundaryIndex = startIndex - 1;
        
        // Traverse through all elements and compare each with the pivot
        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (arr[currentIndex] <= pivot) {
                boundaryIndex++;
                // Swap if the element is less than or equal to the pivot
                swap(arr, boundaryIndex, currentIndex);
            }
        }
        
        // Swap the pivot element with the element at boundaryIndex + 1
        swap(arr, boundaryIndex + 1, endIndex);
        
        return boundaryIndex + 1; // Return the position of the pivot
    }

    // Implement the swap method
    private void swap(int[] arr, int leftIndex, int rightIndex) {
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}