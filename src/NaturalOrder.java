import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ConcurrentSkipListMap;

public class NaturalOrder {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        map.forEach((key, value) ->System.out.println(key + " -> "+ value));
    }
}
