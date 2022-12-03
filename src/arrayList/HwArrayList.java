package arrayList;

import java.util.ArrayList;

public class HwArrayList {
    public static void main(String[] args) {
     /*
     Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
      */

        ArrayList<String> names=new ArrayList<>();

        names.add("khan");
        names.add("James");
        names.add("Smith");
        names.add("JUlia");
        names.add("Marks");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Smith"));
        System.out.println(names.size());
        System.out.println(names);
        //Printing using for loop

        for (Integer i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }





    }}
