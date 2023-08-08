import java.util.Scanner;

public class PeperoMaker1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Pepero1 pepero = new Pepero1();

        System.out.println("빼빼로 에 대한 정보 입력을 받습니다. 내용이 없을 시 \"null\" 이라고 입력 바랍니다.");
        System.out.print("길이 : ");
        pepero.setLength(sc1.nextInt());
        System.out.print("몸통 모양 : ");
        pepero.setFirstBody(sc2.nextLine());
        System.out.print("교차될 몸통 모양 (기존과 같을 시 같은 모양으로 입력 부탁 드립니다.) : ");
        pepero.setSecondBody(sc2.nextLine());
        System.out.print("토핑 모양 : ");
        pepero.setFirstTopping(sc1.next());
        System.out.print("교차될 토핑 모양 (기존과 같을 시 같은 모양으로 입력 부탁 드립니다.) : ");
        pepero.setSecondTopping(sc1.next());
        System.out.print("막대 길이 : ");
        pepero.setSticklength(sc1.nextInt());

        System.out.println("<정보>");
        System.out.println("길이 : " + pepero.getLength());
        if (pepero.getFirstBody().equals(pepero.getSecondBody())) {
            System.out.println("몸통 : " + pepero.getFirstBody());
        } else {
            System.out.println("몸통 : " + pepero.getFirstBody() + " or " + pepero.getSecondBody());
        }
        if (pepero.getFirstTopping().equals(pepero.getSecondTopping())) {
            System.out.println("토핑 : " + pepero.getFirstTopping());
        } else if (pepero.getFirstTopping().equals("null")){
            System.out.println("토핑 : " + pepero.getSecondTopping());
        } else if (pepero.getSecondTopping().equals("null")) {
            System.out.println("토핑 : " + pepero.getFirstTopping());
        } else {
            System.out.println("토핑 : " + pepero.getFirstTopping() + " or " + pepero.getSecondTopping());
        }
        System.out.println("막대길이 : " + pepero.getSticklength());
        System.out.println();

        for (int i = 0; i < pepero.getLength(); i++) {
            if (pepero.getFirstTopping().equals("null")) {
                System.out.println(" " + pepero.getFirstBody());
            } else {
                System.out.println(pepero.getFirstTopping() + pepero.getFirstBody() + pepero.getFirstTopping());
            }
            i++;
            if (i < pepero.getLength() && pepero.getSecondTopping().equals("null")) {
                System.out.println(" " + pepero.getSecondBody());
            } else if (i < pepero.getLength()) {
                System.out.println(pepero.getSecondTopping() + pepero.getSecondBody() + pepero.getSecondTopping());
            }
        }
        for (int i = 0; i < pepero.getSticklength(); i++) {
            System.out.println(" | |");
        }

    }
}
