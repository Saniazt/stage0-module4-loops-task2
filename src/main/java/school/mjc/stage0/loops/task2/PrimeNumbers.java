package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int result = 2;
        while (result <= printToInclusive) {
            int count = 0;
            int check = 1;
            while (check <= result / 2) {
                if (result % check == 0) {
                    count++;
                }
                check++;
            }
            if (count == 1) {
                System.out.println(result);
            }
            result++;
        }
    }
}
