import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(2,3,4,5,6,7,8,9)
        );

        //Method 1
//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            Integer element = iterator.next();
//            if(element % 2 == 0){
//                iterator.remove();
//            }
//        }
//
        // Method 2
//        list.forEach(System.out::println);
        // Method 2
//        for (Integer element: list){
//            list.remove(element);
//        }
//
//        list.forEach(System.out::println);

        //Method 3
        List<Integer> tempList = new ArrayList<>();
        for(Integer element: list){
            if (element%2 == 0){
                tempList.add(element);
            }
        }
        list.removeAll(tempList);

        list.forEach(System.out::println);


        //Method 1 and 3 remove all even numbers.
    }
}
