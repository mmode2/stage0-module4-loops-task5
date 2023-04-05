package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height) {
                for (int k = 1; k <= height; k++) {
                    System.out.print(8);
                }
            } else if (i <= height / 2) {
                for (int m = 1; m <= height; m++) {
                    if (m >= i && m <= height - i + 1) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (i >= height / 2) {
                for (int m = 1; m <= height; m++) {
                    if (m <= height - i || m > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(8);
                    }
                }
            }
            System.out.println();
        }
    }
}
