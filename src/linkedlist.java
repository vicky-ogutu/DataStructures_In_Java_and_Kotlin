import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Student> linkedList=new LinkedList<>();
        linkedList.add(new Student("Vic", 20));
        linkedList.add(new Student("kim", 17));
        linkedList.add(new Student("Maya", 23));

        ListIterator<Student> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

    static record Student(String name, int age){

    }
}
