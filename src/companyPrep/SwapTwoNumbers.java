package companyPrep;

import javafx.util.Pair;

public class SwapTwoNumbers {
    public static Pair < Integer, Integer > swap(Pair< Integer, Integer > swapValues) {
        int a = swapValues.getKey();

        int b = swapValues.getValue();

        int temp = a;

        a = b;

        b = temp;

        Pair ansPair = new Pair(a,b);

        return ansPair;
    }

    public static void main(String[] args) {
        System.out.println("Swap");
//[1,3,5,6], target = 5





    }
}
