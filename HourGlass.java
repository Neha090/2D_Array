/*
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
For example, given the 2D array:

sample input 

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output :19

The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

      int sum=0,count=-10000;
      for(int i=0;i<4;i++)
      {
          for(int j=0;j<4;j++)
          {
            for(int k=j;k<j+3;k++)
            {
                sum=sum+arr[i][k]+arr[i+2][k];
            } 
            sum=sum+arr[i+1][j+1];
            if(sum>count)
            {
                count=sum;
            }
            sum=0;
          }
      }
      return count;
    }

public static void main(String[] args) throws IOException {
    
      Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
               arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(hourglassSum(arr));

   
