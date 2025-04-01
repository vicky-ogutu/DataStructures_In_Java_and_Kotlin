public class binary_search1 {

    public static void main(String[]args){

        int[]a = {1,2,3,4,5,6,7};
        int result=searchArr(a, 6);
        System.out.println(result);

    }

    public static int searchArr(int[]arr, int target){

        int left = 0;
        int right =arr.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]<left){
             left =mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }


}
