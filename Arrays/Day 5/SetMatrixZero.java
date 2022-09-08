// T C : 2 * ( M * N ) === O ( M * N )
// S C : O ( 1 )

class Solution {
    public void setZeroes(int[][] matrix) {
        
        // T C : 2 * ( M * N ) === O ( M * N )
        // S C : O ( 1 )
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col0 = 1;
        
        // MAP THE COLUMN AND ROW WHICH HAS TO BE ZERO
        for(int i = 0; i < rows ; i++){
            // Condition for 0th Column
            if( matrix[i][0] == 0 ){
                col0 = 0;
            }
            
            for(int j = 1 ; j < cols ; j++){
                if( matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        // SET ZERO TO EVERY CELLS WITH HELP OF MAP
        for(int i = rows -1; i >= 0; i--){
            for(int j = cols - 1; j >= 1; j--){
                if( matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if( col0 == 0 ){
                matrix[i][0] = 0;
            }
        }
        
    }
}

// ==================================================
//         MORE DETAILED WAY OF SAME APPROACH
// ==================================================

class Solution {
    public void setZeroes(int[][] matrix) {
                   
        boolean firstCol = false;
        boolean firstRow = false;
        
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        
        // MAP IF THE ANY ZERO IS PRESENT
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        // SET ZERO TO CELL ACCORDING TO MAP
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        if(firstCol){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        
        if(firstRow){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        
    }
}
