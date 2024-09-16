package ru.otus.gc;

import ru.otus.gc.clases.AAA;
import ru.otus.gc.clases.BBB;

import java.util.Scanner;

public class GcRoot {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of program!");

        var aaa = new AAA();
        var bbb = new BBB(aaa);
        var bbb1 = new BBB(new AAA());

        new Scanner(System.in).nextLine();
        System.out.println("set null");

        aaa = null;
        bbb1.setA(null);

        new Scanner(System.in).nextLine();
        System.out.println("End of program!");
    }
}

