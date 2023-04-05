package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            if (i == sideLength / 2 + 1) {
                for (int m = 1; m <= sideLength; m++) {
                    System.out.print(8);
                }
            } else {
                for (int k = 1; k <= sideLength; k++) {
                    if (k == sideLength / 2 + 1) {
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
