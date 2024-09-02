package BinarySearch;

public class Search2DMatrixArray {

    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int top = 0;
        int bottom = numRows - 1;
        while(top <= bottom){
            int middleRow = (top + bottom) / 2;
            if(target < matrix[middleRow][0]){
                bottom = middleRow - 1;
            }
            if(target > matrix[middleRow][numCols - 1]){
                top = middleRow + 1;
            }else{
                break;
            }
        }

        if(top > bottom) return false;

        int targetRow = (top + bottom) / 2 ;

        int left = 0;
        int right = matrix[0].length -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(target > matrix[targetRow][mid]) {
                left = mid + 1;
            } else if( target < matrix[targetRow][mid]){
                right = mid -1;
            }else{
                return true;
            }
        }

        return false;
    }


/*
[[1,2,4,8],
[10,11,12,13],
[14,20,30,40]], target = 10

{row , col}
{1 , col}
*/
}

/*
Search 2D Matrix
Solved
You are given an m x n 2-D integer array matrix and an integer target.

Each row in matrix is sorted in non-decreasing order.
The first integer of every row is greater than the last integer of the previous row.
Return true if target exists within matrix or false otherwise.

Can you write a solution that runs in O(log(m * n)) time?

Example 1:



Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10

Output: true
Example 2:



Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15

Output: false
Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-10000 <= matrix[i][j], target <= 10000
*/