import java.util.*;
public class Problem1 {
    static void maximum(int[][] arr){
        int row,col;
        int max=arr[0][0];
        for (row=0;row< arr.length;row++){
            for (col=0;col<arr[row].length;col++){
                if (arr[row][col]>max){
                    max=arr[row][col]-2;
                }

            }
        }
        System.out.println("the third maximum value is: "+max);



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int row = scan.nextInt();
        System.out.println("Enter no.of cols:");
        int col = scan.nextInt();
        System.out.print("Enter the Matrix Number:");
        int [][] arr =new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("The Matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        maximum(arr);
    }
}
