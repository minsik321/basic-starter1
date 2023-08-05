import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PeperoMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        Pepero order;
        Pepero example1 = new Pepero
                (10, "***", " ", 4);
        Pepero example2 = new Pepero
                (12, "***", "&", 4);
        Pepero example3 = new Pepero
                (12, "***", "#", 6);
        Pepero example4 = new Pepero
                (7, "|0|", "| |", "#", " ", 3);

        input = sc.next();

        switch (input) {
            case "1":
                order = example1;
                break;
            case "2":
                order = example2;
                break;
            case "3":
                order = example3;
                break;
            case "4":
                order = example4;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }

        System.out.println("<정보>");
        System.out.println("길이: " + order.length);
        if (order.secondBody == null) {
            System.out.println("몸통: " + order.firstBody);
        } else {
            System.out.println("몸통: " + order.firstBody + " or " + order.secondBody);
        }
        System.out.println("토핑: " + order.firstTopping);
        System.out.println("막대길이: " + order.stickLength);
        System.out.println();

        if (order.secondBody == null) {
            for (int i = 0; i < order.length; i++) {
                System.out.println(order.firstTopping + order.firstBody + order.firstTopping);
            }
        } else {
            for (int i = 0; i < order.length; i++) {
                System.out.println(order.secondTopping + order.firstBody + order.secondTopping);
                i++;
                if (i < order.length) {
                    System.out.println(order.firstTopping + order.secondBody + order.firstTopping);
                }
            }
        }
        for (int i = 0; i < order.stickLength; i++) {
            System.out.println(" | |");
        }
    }
}
