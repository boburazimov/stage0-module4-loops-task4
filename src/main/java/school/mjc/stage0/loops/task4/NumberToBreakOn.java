package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        boolean checkToLess = true;
        for (int i = 0; i < numberToGoUntil; i++) {
            if (numberToGoUntil < toBreakWith && checkToLess) {
                System.out.println("iterating till the end");
                numberToGoUntil++;
                checkToLess = false;
            }
            if (i >= toBreakWith) {
                System.out.println(i);
                break;
            } else if (i > 0){
                System.out.println(i);
            }
        }
    }
}
