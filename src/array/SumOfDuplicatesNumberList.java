package array;

import java.util.*;
import java.util.stream.Collectors;

public class SumOfDuplicatesNumberList {
    public void reverseWords(List<Integer> arrys) {
        ArrayList<Integer> listnew = new ArrayList<>();
        ArrayList<Integer> listnewr = new ArrayList<>();
        ArrayList<Integer> group = new ArrayList<>();


        for (int i = 0; i < arrys.size(); i++) {
            for (int j = i+1; j < arrys.size() -1; j++) {
                if (arrys.get(i).equals(arrys.get(j))) {
                    listnew.add(arrys.get(j));
                } else {
                    listnewr.add(arrys.get(j));
                }
                group.addAll(listnew);
            }
            System.out.println(listnew);

        }


    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//
        // [[4,4,4],[6,6],[9,9],[2],[3],[10]]
        ArrayList<Integer> al = new ArrayList<Integer>();
        List<Integer> slist = Arrays.asList(4, 6, 9, 2, 3, 4, 9, 6, 10, 4);

        List<Integer> sortedList = slist.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //sortedList.forEach(System.out::println);
        SumOfDuplicatesNumberList sumOfDuplicatesNumberList = new SumOfDuplicatesNumberList();
        sumOfDuplicatesNumberList.reverseWords(sortedList);

    }
}
