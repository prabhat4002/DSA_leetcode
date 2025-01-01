class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] arr=matrix;
        int col0=1;
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][0]==0||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(arr[0][0]==0){
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<m;i++){
                arr[i][0]=0;
            }
        }
    }
}