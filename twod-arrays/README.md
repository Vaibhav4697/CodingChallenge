# 2D Arrays

Objective
Today, we're building on our knowledge of Arrays by adding another dimension.

Context
Given a 6X6 2D Array, A:

1 1 1 0 0 0

0 1 0 0 0 0

1 1 1 0 0 0

0 0 0 0 0 0

0 0 0 0 0 0

0 0 0 0 0 0

We define an hour glass in A to be a subset of values with indices falling in this pattern in A's graphical representation:

a b c

  d

e f g

There are 16 hour glasses in A, and an hour glass sum is the sum of an hour glass' values.

Task
Calculate the hour glass sum for every hour glass in A, then print the maximum hour glass sum.

Input Format
There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of -9 to +9.

Output Format
Print the largest (maximum) hour glass sum found in A.

Sample Input

1 1 1 0 0 0

0 1 0 0 0 0

1 1 1 0 0 0

0 0 2 4 4 0

0 0 0 2 0 0

0 0 1 2 4 0

Sample Output

19

Explanation

A contains the following hour glasses:

1 1 1   1 1 0   1 0 0   0 0 0

  1       0       0       0

1 1 1   1 1 0   1 0 0   0 0 0


0 1 0   1 0 0   0 0 0   0 0 0

  1       1       0       0

0 0 2   0 2 4   2 4 4   4 4 0


1 1 1   1 1 0   1 0 0   0 0 0

  0       2       4       4

0 0 0   0 0 2   0 2 0   2 0 0


0 0 2   0 2 4   2 4 4   4 4 0

  0       0       2       0

0 0 1   0 1 2   1 2 4   2 4 0

The hour glass with the maximum sum (19) is:

2 4 4

  2

1 2 4