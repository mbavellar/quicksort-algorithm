package com.youlearncode.algorithms;

public class DualPivotQuickSort extends com.youlearncode.algorithms.BaseSort {
  
  record Pivot(int left, int right) { }
  
  public static void sort(int[] arr) {
    sort(arr, 0, arr.length - 1);
  }
  
  private static void sort(int[] arr, int currentLow, int currentHigh) {
    
    if (currentLow >= currentHigh) return;
    Pivot pivot = partition(arr, currentLow, currentHigh);
    sort(arr, currentLow,  pivot.left - 1);
    sort(arr, pivot.left + 1, pivot.right - 1);
    sort(arr, pivot.right + 1, currentHigh);
  }
  
  private static Pivot partition(int[] arr, int low, int high) {
    if (arr[low] > arr[high]) swap(arr, low, high);
    
    int leftPivotIndex = low + 1;
    int rightPivotIndex = high - 1;
    
    int iterator = low + 1;
    while (iterator <= rightPivotIndex) {
      if (arr[iterator] < arr[low]) swap(arr, iterator++, leftPivotIndex++);
      else if (arr[iterator] > arr[high]) swap(arr, iterator, rightPivotIndex--);
      else iterator++;
    }
    
    swap(arr, low, --leftPivotIndex);
    swap(arr, high, ++rightPivotIndex);
    return new Pivot(leftPivotIndex, rightPivotIndex);
  }
}
