class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralNumbers = new ArrayList<>();
        
        int limitR = matrix[0].length -1;
        int limitL = 0;

        int limitH = 0;
        int limitB = matrix.length -1;

        int numberOfElements = matrix.length * matrix[0].length;
        while(spiralNumbers.size() < numberOfElements){
            //first step is going to the right;
            for(int i = limitL; i <= limitR; i ++){
                spiralNumbers.add(matrix[limitH][i]);
            }
            limitH++;
            if(spiralNumbers.size() == numberOfElements) break;
            //second step is going to the bottom;
            for(int j = limitH ; j <= limitB; j++){
                spiralNumbers.add(matrix[j][limitR]);
            }
            limitR--;
            //third step is going to the left;
            if(spiralNumbers.size() == numberOfElements) break;
            for(int k = limitR ; k >= limitL; k--){
                spiralNumbers.add(matrix[limitB][k]);
            }
            limitB--;
            //last step is going up;
            if(spiralNumbers.size() == numberOfElements) break;
            for(int l = limitB ; l >= limitH; l--){
                spiralNumbers.add(matrix[l][limitL]);
            }
            limitL++;
            if(spiralNumbers.size() == numberOfElements) break;
        }

        return spiralNumbers;
    }
}

/*
matrix = [[1,2,3],[4,5,6],[7,8,9]]

verticalWall = matrix[0].lenght
horizontalWall = matrix.lenght

            
[ 1 , 2 , 3 | ],
[ 4 , 5 , 6 | ],
[ 7 , 8 , 9 | ]
--------------            


[0,0] , [0,1], [0,2]  , [1,2] , [2,2]  

*/