package Recursion;

public class passingConcept {

    static void passing(){
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i < 6; ++i) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        passing();
    }
}
