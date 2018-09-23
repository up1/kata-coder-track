import java.util.*;
import java.util.stream.Collectors;

public class Problem14 {
    public static void main(String[] args) {
        List<String> result = ReadFile.read("14.txt");
        for (String input: result) {
            int number = Integer.parseInt(input);
            calculate(number);
        }

    }

    private static void calculate(int number) {
        int _number = number;
        Map<Integer, Integer> result = new HashMap<>();
        int primeNumber = 2;
        while (_number>1) {
            while (_number%primeNumber == 0) {
                int count = result.get(primeNumber) == null ? 1 : result.get(primeNumber) + 1;
                result.put(primeNumber, count);
                _number = _number / primeNumber;
            }
            primeNumber++;
        }
        showResult(result, number);
    }

    private static void showResult(Map<Integer, Integer> result, int number) {
        System.out.print(number + " = ");
        List<String> t = new ArrayList<>();
        Set<Integer> keys = result.keySet();
        List<Integer> keysInt = keys.stream().sorted((o1, o2) -> o1-o2).collect(Collectors.toList());
        for (int primeNumber: keysInt) {
            String temp = String.format("%d", primeNumber);
            if(result.get(primeNumber) > 1) {
                temp = String.format("%d^%d", primeNumber, result.get(primeNumber));
            }
            t.add(temp);
        }
        System.out.println(String.join(" * ", t));
    }



}
