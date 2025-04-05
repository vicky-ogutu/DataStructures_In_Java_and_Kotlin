import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Ball> balls =new HashSet<>();
        balls.add(new Ball("Res"));
        balls.add(new Ball("white"));

        balls.forEach(System.out::println);
    }
    static record Ball(String colors){}

}
