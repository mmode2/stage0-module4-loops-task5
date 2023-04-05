package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 1; i <= sideLength; i++) {
            if (i == 1 || i == sideLength) {
                for (int k = 1; k <= sideLength; k++) {
                    System.out.print(8);
                }
            } else {
                for (int m = 1; m <= sideLength; m++) {
                    if(m==1 || m== sideLength){
                        System.out.print(8);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
