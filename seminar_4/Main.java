package seminar_4;

import seminar_4.gb_collections.GbList;
import seminar_4.gb_collections.lists.*;


public class Main {
    public static void main(String[] args) {
        // GbList<Integer> list = new GbArrayList<>();
        // list.add(5);
        // list.add(9);
        // System.out.println(list.size());
        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);
        // list.add(3);
        // list.add(2);
        // list.add(6);
        // System.out.println(list);
        // list.add(2, 1 );
        // System.out.println(list);
        GbList<Integer> list  = new GbLinkedList<>();
        System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        Integer value = 3;
        // list.add(value, 3);
         list.remove(value);
         list.add(3);

        // list.remove(1);
        System.out.println(list);
        // list.remove(1);
        // System.out.println(list.size());
        // System.out.println(list.get(1));
        // System.out.println(list);


    }

}
