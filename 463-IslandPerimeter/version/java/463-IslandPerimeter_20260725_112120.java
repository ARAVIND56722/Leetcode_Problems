// Last updated: 25/7/2026, 11:21:20 am
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int peri=0;
4    
5        for(int i=0;i<grid.length;i++){
6            for(int j=0;j<grid[0].length;j++){
7                if(i>=0 && j<=grid[0].length-1 && grid[i][j]==1){
8                     int sum=4;
9                    if(i+1<grid.length && grid[i+1][j]==1){
10                        sum=sum-1;
11                    }
12                    if(j-1>=0 && grid[i][j-1]==1){
13                        sum=sum-1;
14                    }
15                    if(j+1<grid[0].length && grid[i][j+1]==1){
16                        sum=sum-1;
17                    }
18                    if(i-1>=0 && grid[i-1][j]==1){
19                        sum=sum-1;
20                    }
21                     peri=peri+sum;
22                }
23               
24            }
25
26        }
27        return peri;
28    }
29}