import java.util.ArrayList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("foo");

        List<String> list2 = list1;

        List<String> list3 = new ArrayList<>(list2);

        list1.clear();
        list2.add("bar");
        //list1.add("bar");
        list3.add("baz");

        System.out.println("list1 " + list1);
        System.out.println("list2 " + list2);
        System.out.println("list3 " + list3);

        /* Output **/
        /*
         * list1 [bar]
         * list2 [bar]
         * list3 [foo, baz]
         * **/

    }
}
