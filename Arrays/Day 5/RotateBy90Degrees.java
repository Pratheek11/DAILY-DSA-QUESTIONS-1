/*

Algorithm:
1. Matrix transepose
2. Reverse each row of matrix

| 1 | 2 |   =>> | 1 | 3 |  =>>  | 3 | 1 |
| 3 | 4 |       | 2 | 4 |       | 4 | 2 |

*/

class Solution {
    public void rotate(int[][] matrix) {
         int i=0,j=0,temp=0;
        //transpose
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<i;j++)//note j<i and not j<=i, j<=i will run for(0,0/1,1/2,2.....) which are of no use
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        temp=0;
        //row reversing
        for(i=0;i<matrix.length;i++)
        {
             for(j=0;j<matrix[0].length/2;j++)
            {
                 temp=matrix[i][j];
                 matrix[i][j]=matrix[i][matrix[0].length-1-j];
                 matrix[i][matrix[0].length-1-j]=temp;
            }
        }
    }
}
