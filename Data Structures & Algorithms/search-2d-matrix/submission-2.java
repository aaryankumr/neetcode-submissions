class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n -1;

        while(low <= high){
            int midd = (low+high) /2;
            int row = midd / n;
            int col = midd % n;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                low = midd +1;

            }
            else{
                high = midd -1;
            }
        }
        return false;
        
    }
}
