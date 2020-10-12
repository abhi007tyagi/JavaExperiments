package tyagiabhinav.codewars;

import java.util.stream.IntStream;

public class Multipleof3Or5 {
    private static int solution(int number) {
        return IntStream.range(0, number).filter(n -> (n % 3 == 0 || n % 5 == 0)).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
