public class Problem4 {
        public static void main(String[] args) {
            int [][] arr={{4456,5678,2345},
                    {5564,3345,1234},
                    {5431,4567,7890}
            };
            int count=0;
            for (int i=0;i<arr.length;i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(abundant(arr[i][j])){
                        count++;
                    }
                }
            }
            if (count%2==0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }
        static boolean abundant(int arr){
            int sum=0;

            for (int k=1;k<arr;k++){
                if (arr%k==0){
                    sum+=k;
                }
            }
            if (sum>arr){
                return true;

            }
            return false;

        }
    }

