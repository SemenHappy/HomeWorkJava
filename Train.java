package OopPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Man[] train = new Man[3];
        train[0] = new Man("Bob", 18, "shirt");
        train[1] = new Man("Stiv", 22, "Jacket");
        train[2] = new Man("Rob", 33, "Tshirt");

        for (int i = 0; i < train.length; i++) {
            System.out.println(i);

            System.out.println(Arrays.toString(train));

        }


    }

}


