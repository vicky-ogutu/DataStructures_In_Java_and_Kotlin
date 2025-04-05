import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<Integer, Student> map =new HashMap<>();
        map.put(1, new Student("Brian"));
        map.put(2, new Student("Kevin"));

        System.out.println(map);
    }

    record Student(String name){

    }
}
