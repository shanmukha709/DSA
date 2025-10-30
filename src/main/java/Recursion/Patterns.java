package Recursion;

public class Patterns {

    static void pattern1(int r, int c){

        if(r == 0){
            return;
        }

        if (c < r){
            System.out.print("* ");
            pattern1(r, c + 1);
        }else {
            System.out.println();
            pattern1(r-1, 0);
        }
    }

    static void pattern2(int r, int c){

        if(r == 0){
            return;
        }

        if (c < r){
            pattern2(r, c + 1);
            System.out.print("* ");
        }else {
            pattern2(r-1, 0);
            System.out.println();
        }
    }


    static void triangle(int totalRows, int currentRow){
        if (currentRow > totalRows) return;
        printSpaces(totalRows - currentRow);
        printStars(currentRow);
        System.out.println();
        triangle(totalRows, currentRow + 1);
    }

    static void printSpaces(int count){
        if (count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    static void printStars(int count){
        if (count == 0) return;
        System.out.print("* ");
        printStars(count - 1);
    }
    public static void main(String[] args) {
        pattern1(4,0);
        pattern2(4,0);
        System.out.println();
        System.out.println();
        triangle(4,1);
    }
}