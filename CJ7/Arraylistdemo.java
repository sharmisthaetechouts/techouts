package CJ7;

import java.util.*;
public class Arraylistdemo {

    static void main() {
        ArrayList<String>fruitlist=new ArrayList<>();
        fruitlist.add("Apple");
        fruitlist.add("Mango");
        fruitlist.add("Orange");
        fruitlist.add("papaya");
        System.out.println(fruitlist);
        fruitlist.remove(1);
        System.out.println(fruitlist.contains("Mango"));
        System.out.println(fruitlist.size());
        for(String i: fruitlist){
            System.out.println(i);
        }

        ArrayList<Integer> numbersList =new ArrayList<>();
        numbersList.add(4);
        numbersList.add(1);
        numbersList.add(5);
        numbersList.add(2);
        numbersList.add(3);


        Collections.sort(numbersList);

        Iterator<Integer> it=numbersList.iterator();

        ArrayList<Integer> al = new ArrayList<Integer>();
        // Print the size of the ArrayList using the size() method
        System.out.println("The size of the array is: " + al.size());
        while(it.hasNext()){
            Integer num=it.next();
            System.out.println(num);
        }

        for(int num : numbersList) {
            System.out.println(num); //Enchanced loop
        }

        for(int j=0;j<numbersList.size();j++){
            System.out.println(numbersList.get(j));
        }

    }


}
