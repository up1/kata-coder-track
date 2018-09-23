import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem15 {
    static Map<Integer , Integer> outputs = new HashMap<>();
    static ArrayList<Integer> moneys = new ArrayList<Integer>() {{
        add(500);
        add(100);
        add(50);
        add(20);
        add(10);
        add(5);
        add(2);
        add(1);
    }};
    public static void main(String[] args) {
        List<String> result = ReadFile.read("15.txt");
        for (int i=0; i<result.size(); i++) {
            int input = 1000 - Integer.parseInt(result.get(i));

            for(int temp: moneys) {
                int remain = input / temp ;
                if (remain > 0) {
                    int count = (outputs.get(temp) == null) ? remain : outputs.get(temp) + remain;
                    outputs.put(temp, count);
                    input = input - (temp * remain);
                }
            }

        }

        for(int temp: moneys) {
            int count = (outputs.get(temp) == null) ? 0 : outputs.get(temp);
            System.out.printf("%dx %d\n", count, temp);
        }

    }


}
