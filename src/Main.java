import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.reflect.Array.*;


public class Main { public static void main(String[] args) {
        // 31, 45, 22, 98, 10
        int[] numbers = new int[5];

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] numbers2 ={31, 45, 22, 98, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavCandy = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1:" + myFavCandy[1]);
        myFavCandy[2] = "ButterFinger";
        System.out.println("Index 2:" + myFavCandy[2]);
        System.out.println("Lenght: " + myFavCandy.length);
    }
}
