import java.io.* ;

class TwoDPractice
{
   
    /**
     * return the sum of all elements in the given row
     */
    public  int rowSum (int[][] data, int row) 
    {
        int sum = 0;
        for(int i = 0; i < data[row].length; i++){
          sum = sum + data[row][i];
        }
        return sum;
    }

    /**
     * return the sum of all elements in the given column
     */
    public int columnSum(int[][] data, int col)
    {
        int sum2 = 0;
        for(int i = 0; i < data[col].length; i++){
          sum2 = sum2 + data[i][col];
        }
        return sum2;
    }
}      
