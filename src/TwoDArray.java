import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        char[][] timetable= new char[2][2];
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                timetable[i][j]='2';
            }
        }
        System.out.println(Arrays.deepToString(timetable));
    }
}
