import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        char[][] timetable= new char[2][2];
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                timetable[i][j]='2';
            }
        }
        int[][] nums2 =new int[3][3];
        nums2[0][0]=10;
        nums2[0][1]=20;

        int[][] dash=new int[][]{
            new int[]{1,2,3},
            new int[]{4,5,6},
            new int[]{7,8,9}
        };


        int[][] marks ={{20,30,40}, {50,60,70}, {80,90,100}};

        System.out.println(Arrays.deepToString(timetable));
        System.out.println(Arrays.deepToString(nums2));
        System.out.println(Arrays.deepToString(dash));
        lopp2D(marks);
    }

    public  static  void lopp2D(int[][] nums){

        for (int i=0; i< nums.length; i++){
            for (int j=0; j<nums.length; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
