package com.youlearncode.algorithms;

public abstract class BaseSort {
  private static long swapTimes;
  public static <E> void swap(E[] arr, int firstIndex, int secondIndex) {
    if (firstIndex != secondIndex) {
      E temp = arr[firstIndex];
      arr[firstIndex] = arr[secondIndex];
      arr[secondIndex] = temp;
      swapTimes += 2;
    }
  }
  
  public static void swap(int[] arr, int firstIndex, int secondIndex) {
    if (firstIndex != secondIndex) {
      int temp = arr[firstIndex];
      arr[firstIndex] = arr[secondIndex];
      arr[secondIndex] = temp;
      swapTimes += 2;
    }
  }
  
  public static long getSwapTimes() {
    long temp = swapTimes;
    swapTimes = 0L;
    return temp;
  }
  
  public static void incrementSwap() {
    swapTimes++;
  }
}
