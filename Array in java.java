import java.util.*;

class Array {
 public static void main(String[] args) {
 int[] month_days;
 month_days = new int[12];
 month_days[0] = 31;
 month_days[1] = 28;
 month_days[2] = 31;
 month_days[3] = 30;
 month_days[4] = 31;
 month_days[5] = 30;
 month_days[6] = 31;
 System.out.println("April has " + month_days[3] + " days.");
 }
}


// Improved version of above program

class AutoArray {
 public static void main(String[] args) {
 int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
 30, 31 };
 System.out.println("April has " + month_days[3] + " days.");
 }
}
