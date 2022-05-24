Problem
You are given a table with  rows and  columns. Each cell is colored with white or black. Considering the shapes created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of consecutive black cells in any row or column without any white cell in between.

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.

Input format

The first line contains  denoting the number of test cases.
The first line of each test case contains integers  denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.' represents a white cell. 
Each of the next  lines contains  integers.
Output format

Print the maximum border of the shapes.

Sample Input
10
2 15
.....####......
.....#.........
7 9
...###...
...###...
..#......
.####....
..#......
...#####.
.........
18 11
.#########.
########...
.........#.
####.......
.....#####.
.....##....
....#####..
.....####..
..###......
......#....
....#####..
...####....
##.........
#####......
....#####..
....##.....
.#######...
.#.........
1 15
.....######....
5 11
..#####....
.#######...
......#....
....#####..
...#####...
8 13
.....######..
......##.....
########.....
...#.........
.............
#######......
..######.....
####.........
7 5
.....
..##.
###..
..##.
.....
..#..
.#...
14 2
..
#.
..
#.
..
#.
..
..
#.
..
..
..
#.
..
7 15
.###########...
##############.
...####........
...##########..
.......#.......
.....#########.
.#######.......
12 6
#####.
###...
#.....
##....
###...
......
.##...
..##..
...#..
..#...
#####.
####..
Sample Output
4
5
9
6
7
8
3
1
14
5
Time Limit: 1
Memory Limit: 256
Source Limit:





CODE:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc =new Scanner(System.in);

int p= sc.nextInt();

for(int k=0 ;k<p;k++){

int m =sc.nextInt();

int n =sc.nextInt();
char arr[][]=new char[m][n];
for(int i=0;i<m;i++){
    String in =sc.next();
    for(int j=0;j<n;j++){
        arr[i][j]=in.charAt(j);
    }
}
int count=0;
List<Integer> list=new ArrayList<>();
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(arr[i][j]=='#'){
            count++;
            list.add(count);
        }
}
count=0;
}
System.out.println(Collections.max(list));
 
}
    }
}
