package CJ7;

import java.util.*;
import java.lang.*;

public class Listdemo {
    public static void main(String args[]){
        List<Integer>list=new ArrayList<Integer>();
        list.add(11);
        list.add(32);
        list.add(35);
        list.add(43);
        list.add(5);
        list.add(16);
        list.add(77);
        list.add(82);
        list.add(98);


        //print
        //1st method
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //2nd method
        for(int ele:list){
            System.out.println(ele);
        }
        //3rd metho
        Iterator<Integer>ir=list.iterator();
        while(ir.hasNext()){

            System.out.println(ir.next());
        }

        System.out.println(list.contains(50));

        while(ir.hasNext()){
            if(ir.next()<30){
                ir.remove();
            }
        }
        ListIterator<Integer> irr = list.listIterator(); //listiterator provides set method

        while (irr.hasNext()) {
            if (irr.next().equals(30)) {
                irr.set(700); // use set(), not replace()
            }
        }

        List<Integer>list2=new ArrayList<Integer>(list);
        System.out.println(list2);


    }

}
