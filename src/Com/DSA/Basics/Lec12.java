package Com.DSA.Basics;

import java.util.ArrayList;

public class Lec12 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        System.out.println(list);
        System.out.println(list.contains(677));
        list.set(0, 99);
        System.out.println(list);

    }


}
