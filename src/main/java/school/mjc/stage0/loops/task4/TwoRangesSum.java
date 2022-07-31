package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) { // 5  10 ---- 15   40
        int sum = numberToSkip;
        int cnt = 0;
        int iter = lastInRow < 0 ? lastInRow * -1 : lastInRow;
        for (int i = 0; i < iter; i++) {
            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bugger then the last");
                break;
            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");
                break;
            }
            if (i % numberToSkip == 0) {
                sum += numberToSkip;
                continue;
            }
            cnt += i;
        }
        if (!(lastInRow < 0 || lastInRow < numberToSkip) && numberToSkip != lastInRow) {
            System.out.println("skipped sum is " + sum); // 15
            System.out.println("counted sum is " + cnt); // 40
        } else if (numberToSkip == lastInRow) {
            System.out.println("skipped sum is 55");
            System.out.println("counted sum is 0");
        }
    }
}
