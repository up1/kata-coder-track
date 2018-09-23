import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem12 {
    static Map<String , Integer> outputs = new HashMap<>();
    static ArrayList<String> names = new ArrayList<String>() {{
        add("A+");
        add("A");
        add("B+");
        add("B");
        add("C+");
        add("C");
        add("D+");
        add("D");
        add("F");
    }};
    public static void main(String[] args) {
        double sum = 0;
        List<String> result = ReadFile.read("12.txt");
        for (String input: result) {
            int score = Integer.valueOf(input);
            if(score>=0 && score <= 100) {
                if(score >= 85) {
                    sum += 4;
                }
                else if(score >= 80) {
                    sum += 3.5;
                }
                else if(score >= 75) {
                    sum += 3;
                }
                else if(score >= 70) {
                    sum += 2.5;
                }
                else if(score >= 65) {
                    sum += 2;
                }
                else if(score >= 60) {
                    sum += 1.5;
                }
                else if(score >= 55) {
                    sum += 1;
                }
                else if(score >= 50) {
                    sum += 0.5;
                } else {
                    sum += 0;
                }
            }
        }

        System.out.println(String.format("%.3f", sum/result.size()));

    }


}
