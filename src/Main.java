import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] counties = new String[4];
        char[][] names =new char[4][4];

        for (int a=0; a<4; a++){
            for (int b=0; b<4; b++){
                names[a][b]= 'v';
            }
        }
       // Arrays.stream(names).forEach(System.out::println);
        System.out.println(Arrays.deepToString(names));
       // System.out.println(names[0][1]);







        counties[0]="nairobi";

//        for (int i=0; i<counties.length; i++){
//           System.out.println(counties[i]);
//        }


//        for (String x:counties){
//            System.out.println(x);
//        }

      //  Arrays.stream(counties).forEach(System.out::println);

        System.out.println(Arrays.toString(counties));
    }
}