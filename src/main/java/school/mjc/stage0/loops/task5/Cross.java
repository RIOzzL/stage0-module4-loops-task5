package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if (i == (int) (sideLength / 2.0 + 0.5)) {
                    System.out.print("8");
                } else if (j == (int) (sideLength / 2.0 + 0.5) & i != (sideLength / 2.0 + 0.5)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
