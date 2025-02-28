import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int arr[][] = {{5,4,7},{1,8,3},{9,6,2}};
        int i,j=0;
        int index=0;
        int row = arr.length;
        int col = arr[0].length;
        int mat[]=new int[row*col];
        for ( i = 0; i < row ; i++) {
            for (j = 0; j < col; j++) {
                mat[index++]=arr[i][j];
            }
        }
        Arrays.sort(mat);
        index=0;
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                arr[i][j]=mat[index++];
            }
        }
        System.out.println("Sorted Matrix:");
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
