import java.util.*;

class Main {

  public static void main(String[] args) {
    int num = 5;
    System.out.println("Sum Under : " + sumUnder(num));
    int exp = 2;
    System.out.println("Exponent Recursion : " + exponentRecursion(num,exp));
    String str = "hello";
    System.out.println("Reverse String : " + reverse(str));
    System.out.println("Even : " + even(7));
  }

  // Sum all integers below a given integer //
  public static int sumUnder(int num) {
    if(num == 1) {
      return 0;
    }
    else {
      return sumUnder(num - 1) + (num - 1);
    }
  }

  // Compute the exponent of a number //
  public static int exponentRecursion(int num, int exp) {
    if(exp == 0){
      return 1;
    }
    else{
      return num * exponentRecursion(num, exp-1);
    }
  }

  // Write a function that reverses a string //
  public static String reverse(String s) {
    if(s.length() == 1) {
      return s;
    }
    else {
      return reverse(s.substring(1)) + s.charAt(0);
    }
  }

  // Check if a number is even //
  public static boolean even(int num) {
    if (num == 1) {
      return false;
    }
    if (num == 0) {
      return true;
    }
    else {
      return even(num - 2);
    }
  }

}