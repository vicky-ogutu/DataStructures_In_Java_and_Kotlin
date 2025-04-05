import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Players> arsenal =new LinkedList<>();
        arsenal.add(new Players("Bukayo", 24));
        arsenal.add(new Players("Fabio", 25));

        System.out.println(arsenal.size());
        System.out.println(arsenal.peek());
        System.out.println(arsenal.poll());
        System.out.println(arsenal.size());
        System.out.println(arsenal);
    }

    static record Players(String name, int age){

    }
}
