package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height) {
                for (int k = 1; k <= length; k++) {
                    System.out.print(8);
                }
            } else {
                for (int m = 1; m <= length; m++) {
                    if (m == 1 || m == length) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
