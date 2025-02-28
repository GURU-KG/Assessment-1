public class Problem3 {
    public static void main(String[] args) {
        int arr[][]={{5,4,7},{1,8,3},{9,6,2}};
        int i,j=0;
        int row = arr.length;
        int col = arr[0].length;
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                if (arr[i]!=arr[j])
                {
                    arr[j][i]=arr[i][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
