package NewFea;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Str {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
//        List<Integer> listEven  = new ArrayList<>();
//        for(Integer i: list1){
//            if(i % 2 ==0){
//                listEven.add(i);
//            }
//
//        }
//        System.out.println(list1);
//        System.out.println(listEven);

//        using stream

        List<Integer> newList = list1.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
