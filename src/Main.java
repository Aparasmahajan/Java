import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Z z = new Z();
//        Z.A obj = z.new B();
//        HashMap<String,String> map = new HashMap<>();
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//        map.put("key4", "value4");
//        map.put("key5", "value5");
//        map.forEach( (k,v) -> {
//            System.out.print(k+ " : ");
//            System.out.println(v);
////            try {
////                Multithread.sleep(1000);
////            } catch (InterruptedException e) {
////
////            }
//        });
//        Stream<String> listStrea = map.entrySet()
//                .stream()
//                .filter(entry -> entry.getKey().contains("1"))
//                .map(Map.Entry::getValue);
//        listStrea.forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);

        List<Integer> listStream= list.parallelStream()
                                        .filter(k-> (k % 2) == 0)
                                        .distinct().skip(2).limit(3)
                                        .map(x->x/2).collect(Collectors.toList());
        listStream.forEach(System.out::println);
//        System.out.println (obj.getCount());
//        System.out.println(String.valueOf(Z.A.count));
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        Z.A obj1 = z.new B();
//        System.out.println(obj1.getA());
    }
}