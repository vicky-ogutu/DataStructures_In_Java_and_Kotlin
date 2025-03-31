import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists {

    public static void main(String[]args){

        List players =new ArrayList();
        players.add("habana");
        players.add("Henry");
        players.add("Thierry");

        //players.forEach(System.out::println);
        //System.out.println(players);
        System.out.println(players.contains("habana"));
        System.out.println(players.contains("vic"));

        for (int i=0; i<players.size(); i++){
            System.out.println(players.get(i));
        }


    }
}
