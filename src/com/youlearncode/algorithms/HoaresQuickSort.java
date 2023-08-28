package com.youlearncode.algorithms;

public class HoaresQuickSort extends BaseSort {
  
  // Allows us to call sort passing just the arr instead of passing the array plus its boundaries.
  public static void sort(int[] arr) {
    sort(arr, 0, arr.length - 1);
    //sort2(arr, 0, arr.length - 1);
  }
  
  private static void sort(int[] arr, int start, int end) {
    // Base case to stop recursion.
    if (start >= end) return;
    
    // Rearrange the array based on the pivot and return the pivot index.
    int pivotIndex = partition(arr, start, end);
    // Sort the elements to the left of the pivot.
    sort(arr, start, pivotIndex - 1);
    // Sort the elements to the right of the pivot.
    sort(arr, pivotIndex + 1, end);
  }
  
  private static void sort2(int[] arr, int start, int end) {
    if (start >= end) return;
  
    int index = partition2(arr, start, end);
    sort(arr, start, index);
    sort(arr, index + 1, end);
  }
  
  private static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    //int pivot = arr[start];
    int lp = start; // Left pointer
    int rp = end - 1;  // Right pointer
    
    while (true) {
      while (arr[lp] <= pivot && lp < end) lp++;
      while (arr[rp] >= pivot && rp > start) rp--;
      if (lp < rp) swap(arr, lp, rp);
      if (lp >= rp) {
        swap(arr, lp, end);
        return lp;
      }
    }
  }
  
  private static int partitionOptimized(int[] arr, int start, int end) {
    int pivot = arr[end];
    //int pivot = arr[start];
    int lp = start;
    int rp = end;
    
    while (true) {
      while (arr[lp] < pivot && lp < end) lp++;
      while (arr[rp] > pivot && rp > start) rp--;
      //if (lp < rp) swap(arr, lp, rp);
      if (lp >= rp) return lp;
      swap(arr, lp, rp);
    }
  }
  
  private static int partition2(int[] arr, int start, int end) {
    int pivot = arr[start];
    int i = start - 1;
    int j = end + 1;
  
    for (;;)
    {
      while (arr[++i] < pivot);
      while (arr[--j] > pivot);
      if (i >= j) return j;
      swap(arr, i, j);
    }
  }
}
