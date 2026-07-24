// Last updated: 24/7/2026, 9:08:14 pm
1class Solution {
2    public void rotate(int[][] matrix) {
3        int arr[][]=new int[matrix.length][matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix.length;j++){
6                arr[i][j]=matrix[matrix.length-j-1][i];
7            }
8        }
9        for(int i=0;i<matrix.length;i++){
10            for(int j=0;j<matrix.length;j++){
11                matrix[i][j]=arr[i][j];
12            }
13        }
14        return ;
15    }
16}