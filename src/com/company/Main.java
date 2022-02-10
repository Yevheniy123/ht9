package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        LinkList theList1 = new LinkList ();
        LinkList  theList2 = new LinkList ();

        theList1.add("2");
        theList1.add("3");
        theList1.add("4");
        theList1.add("5");
        theList1.add("6");
        theList1.add("7");
        theList1.add("8");
        theList1.show();



        String str ="1 2 5 3 2";
        String[] vrem = str.split(" ");
        theList1.addAll(vrem);

        List<Object> list = new ArrayList<>();
        theList1.addAll(list);
        theList2.addAll(list);
        theList1.delete(4);
        theList1.delete("6" );
        System.out.println("");


        System.out.println(theList1.contains("7"));

        theList1.show();
        System.out.println("");
        System.out.println( theList1.get(1));
        System.out.println(theList1.size());
        theList1.size();
        System.out.println(theList1.compare(theList2));
        theList1.clear();
    }
}
