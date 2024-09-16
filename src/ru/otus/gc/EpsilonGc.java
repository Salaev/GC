package ru.otus.gc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EpsilonGc {

    //-XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -Xms64m -Xmx64m -Xlog:gc*::time -Xlog:gc=debug:file=gc.txt
    public static void main(String[] args)  {
        System.out.println("Start of program!");
        new Scanner(System.in).nextLine();
        System.out.println("start loop");

        for (int i = 200_000; i < 2_000_000; i++) {
            String newString = String.valueOf(i);
        }
        System.out.println("end loop");
    }
}