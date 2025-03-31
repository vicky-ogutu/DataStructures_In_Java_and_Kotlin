import java.util.Stack;

public class stak {
    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.search(30));

    }
}
