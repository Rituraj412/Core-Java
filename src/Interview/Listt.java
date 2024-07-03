package Interview;

import java.util.ArrayList;
import java.util.Objects;

public class Listt {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
//        list.add("Lk");
//        list.add(30);
    }
    private static Integer getValueFromList(ArrayList<Integer> list) {
        return (Objects.nonNull(list) && !list.isEmpty()) ? list.get(0) : null;
    }
}
