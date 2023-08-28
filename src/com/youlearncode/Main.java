package com.youlearncode;

import com.youlearncode.algorithms.HoaresQuickSort;
import com.youlearncode.algorithms.LomutosQuickSort;
import com.youlearncode.performance.Run;

import java.util.Arrays;

import static java.lang.System.out;
public class Main {
  
  static int[] intArray = {-7, 2, -5, 4, -3, -1, 8, 6, -9, 0};
  
  public static void main(String[] args) {
    
    print("Before Sorting:\n" + Arrays.toString(intArray));
    Run.applySortingAlgorithm(LomutosQuickSort.class, intArray.clone());
    Run.applySortingAlgorithm(HoaresQuickSort.class, intArray.clone());
  }
  
  private static void print(String str) {
    out.println(str);
  }
}
