package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        double a, b, c, z;

        Scanner n = new Scanner(System.in);
        System.out.println("a");
        a = n.nextDouble();
        System.out.println("b");
        b = n.nextDouble();
        System.out.println("c");
        c = n.nextDouble();
        z=((a-3)*b/2)+c;
        System.out.println("Rezult: "+z);

    }
}