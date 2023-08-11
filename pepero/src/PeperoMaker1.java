import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeperoMaker1 {
    public static void getAnswers(List<Pepero1> addPeperos) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("빼빼로 에 대한 정보 입력을 받습니다.\n" +
                "순서대로 기입해 주시고, 내용이 없을 시 \"null\" 이라고 입력 바랍니다.\n" +
                "교차 되는 부분이 기존과 같은 모양일 경우 같은 모양으로 입력 바랍니다.\n" +
                "길이, 몸통 모양, 교차될 몸통 모양, 토핑 모양, 교차될 토핑 모양, 막대길이");

        Pepero1 pepero = new Pepero1
                (input1.nextInt(),input2.nextLine(),input2.nextLine(),input1.next(),
                        input1.next(),input1.nextInt());

        addPeperos.add(pepero);

    }
    public static void addPepero(List<Pepero1> addPeperos) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        for (int i = 0; i < addPeperos.size(); i++) {
            System.out.println("추가 하는 빼빼로가 있습니까? yes or no");
            String answer = input1.next();
            if (answer.equals("yes")) {
                System.out.println("추가 빼빼로에 대한 값을 입력 받습니다. 이전과 같이 입력 부탁드립니다.");
                Pepero1 addtionalPepero = new Pepero1
                        (input1.nextInt(),input2.nextLine(),input2.nextLine(),input1.next(),
                        input1.next(),input1.nextInt());
                addPeperos.add(addtionalPepero);
            } else if (answer.equals("no")) {
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
    public static void printInformation(Pepero1 pepero) {
        System.out.println("<정보>");
        System.out.println("길이 : " + pepero.length);
        if (pepero.firstBody.equals(pepero.secondBody)) {
            System.out.println("몸통 : " + pepero.firstBody);
        } else {
            System.out.println("몸통 : " + pepero.firstBody + " or " + pepero.secondBody);
        }
        if (pepero.firstTopping.equals(pepero.secondTopping)) {
            System.out.println("토핑 : " + pepero.firstTopping);
        } else if (pepero.firstTopping.equals("null")){
            System.out.println("토핑 : " + pepero.secondTopping);
        } else if (pepero.secondTopping.equals("null")) {
            System.out.println("토핑 : " + pepero.firstTopping);
        } else {
            System.out.println("토핑 : " + pepero.firstTopping + " or " + pepero.secondTopping);
        }
        System.out.println("막대길이 : " + pepero.sticklength);
        System.out.println();
    }
    public static void printPepero(Pepero1 pepero) {
        for (int length = 0; length < pepero.length; length++) {
            if (pepero.firstTopping.equals("null")) {
                System.out.println(" " + pepero.firstBody);
            } else {
                System.out.println(pepero.firstTopping + pepero.firstBody + pepero.firstTopping);
            }
            length++;
            if (length < pepero.length && pepero.secondTopping.equals("null")) {
                System.out.println(" " + pepero.secondBody);
            } else if (length < pepero.length) {
                System.out.println(pepero.secondTopping + pepero.secondBody + pepero.secondTopping);
            }
        }
        for (int stickLength = 0; stickLength < pepero.sticklength; stickLength++) {
            System.out.println(" | |");
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pepero1> peperos = new ArrayList<>();

        getAnswers(peperos);

        addPepero(peperos);

        for (int numberOfPepero = 0; numberOfPepero < peperos.size(); numberOfPepero++) {
            printInformation(peperos.get(numberOfPepero));
            printPepero(peperos.get(numberOfPepero));
        }
    }
}
