package com.training.fibonacci;

public class Fibonacci {
  static int curr = 1;
  static int prev = 0;
  static int next = 0;

  public static void recursiveFibonacci(int n) {
    if (n > 1) {
      next = curr + prev;
      prev = curr;
      curr = next;
      System.out.print(next + ", ");
      recursiveFibonacci(n - 1);
    }
  }
  
  // will print the n-th sequence of fibonacci
  public int recursiveFibonacciPrintNnumber(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else {
      int x = recursiveFibonacciPrintNnumber(n - 1) + recursiveFibonacciPrintNnumber(n - 2);
      return x;
    }
  }
  
  public void iterativeFibonacci (int n) {
    System.out.print("0, 1, ");
    int curr = 1;
    int prev = 0;
    int next;
    for (int i = 2; i <= n; i++) {
      next = curr + prev;
      prev = curr;
      curr = next;
      System.out.print(next + ", ");
    }
  }

  public static void main(String args[]) {
    recursiveFibonacci(5);
    System.out.println(recursiveFibonacciPrintNnumber(8));
    iterativeFibonacci(7);
  }
}
