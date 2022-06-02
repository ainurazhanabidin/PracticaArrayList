package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> korzina1 = new ArrayList<>();

        ArrayList<Integer> korzina2 = new ArrayList<>();
        ArrayList<Integer> korzina3 = new ArrayList<>();
        Random random=new Random();


        for (int i = 0; i < 50; i++) {
            korzina1.add(random.nextInt(100));
            if (korzina1.get(i)%2==0){
                korzina2.add(korzina1.get(i));
            }else {
                korzina3.add(korzina1.get(i));
            }
        }
        System.out.println(korzina1);
        System.out.println(korzina2);
        System.out.println(korzina3);

//        ArrayList<String> names= new ArrayList<>();
//        names.add("datka");
//        names.add("ainura");
//        names.add("guljan");
//        names.add("nurik");
//        System.out.println(names);//sout mn chygaruu
//        System.out.println("__________---");
//
//        for (String name:names) {
//            System.out.println(name);
//        }//for mn konsolgo chygaruu
//        System.out.println("________________________");
//
//        Iterator<String>iterator= names.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }//iterator mn konsolgo chygaruu


//        //Array listtin metoddoru;
//        names.add(2,"nurtilek");
//        System.out.println(names);
//
//        System.out.println(names.get(1));
//
//        System.out.println(names.size());
//
//        names.set(2,"aizada");
//        System.out.println(names);
//
////        names.remove(1);
//        System.out.println(names.remove(3));


        }
}
