//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I


class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1)
            return s;
        String result = "";
        int length = s.length();
        int group = length/(numRows*2-2);
        char[] input = s.toCharArray();
        char[][] matrix = new char[numRows][(group+1)*(numRows-1)];  
        int flag = 0;
        
        for (int l = 0; l<(group+1)*(numRows-1); l=l+(numRows-1)){           
            for (int r = 0; r<numRows; r++){
                if (flag == length)
                    break;
                matrix[r][l] = input[flag];   
                flag++;
            }                          
            for (int a = 1; a<numRows-1 ;a++){
                if (flag == length)
                    break;                
                matrix[numRows-1-a][l + a] = input[flag];
                flag++;               
            }        
        }
        
        int flagB = 0;
        char[] output = new char[length];
        for (int a=0; a<numRows ;a++){
            for (int b=0; b<(group+1)*(numRows-1) ;b++){
                if (matrix[a][b] != 0){
                    output[flagB] = matrix[a][b];   
                    flagB++;
                }            
            }
        }        
        result = String.valueOf(output);
        return result;  
    }
}

//Runtime: 11 ms, faster than 95.59% of Java online submissions for ZigZag Conversion.
//Memory Usage: 40.3 MB, less than 52.78% of Java online submissions for ZigZag Conversion.