package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> listA = new ArrayList<>();
        ArrayList <String> listB = new ArrayList<>();
        ArrayList <String> listC = new ArrayList<>();

        Iterator <String> iteratorA, iteratorB;

        listA = scan();
        iteratorA = listA.iterator();
        print(listA);

        listB = scan();
        Collections.reverse(listB);
        iteratorB = listB.iterator();
        print(listB);

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            listC.add(iteratorA.next());
            listC.add(iteratorB.next());
        }
        print(listC);
        Comparator <String> comparator = (value1, value2) -> {
          Integer lengh1 = value1.length();
          Integer lengh2 = value2.length();
          return lengh1.compareTo(lengh2);
        };

        listC.sort(comparator);
        print(listC);


    }

    public static void print (ArrayList <String> list) {
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");
    }

    public static ArrayList <String> scan () {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> infoScan = new ArrayList<>();
        int s = 0;
        while (s !=5) {
            infoScan.add(scanner.next());
            s++;
        }
        return infoScan;
    }

}
