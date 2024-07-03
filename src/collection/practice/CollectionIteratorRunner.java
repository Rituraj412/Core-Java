package collection.practice;

import java.util.*;

public class CollectionIteratorRunner {


    static void printElementArray(int[] array){
        System.out.println("Print by using for  loop");

        for(int i=0;i<array.length;i++){
           System.out.print(array[i]);
       }
    }

    static void printElementByUsingIterator(Collection<Integer> array){
        System.out.println("Print by using iterator");
        Iterator<Integer> iterator=array.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }

    static void  printElementArrayByForEachLoop(int[] array){
        System.out.println("Print by using for each loop");
      for(int value:array){
          System.out.print(value);
      }
    }

    public static void main(String[] args) {
        int[] arrayElements=new int[]{0,1,2,3,4,5,6,7,9,9,10};
        printElementArray(arrayElements);
        printElementArrayByForEachLoop(arrayElements);
        List<Integer> list=new  ArrayList<Integer>();
        Set<Integer> integerSet=new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);
        integerSet.add(6);

        printElementByUsingIterator(integerSet);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        printElementByUsingIterator(list);
    }
}
