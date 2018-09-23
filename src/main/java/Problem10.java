import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem10 {

    public static void main(String[] args) {
        Map<String , Integer> outputs = new HashMap<>();

        List<String> result = ReadFile.read("9.txt");
        for (String input: result) {
            String[] datas = input.split(" ");
            String name = datas[0];
            int value = calculate(datas[2], Integer.parseInt(datas[3]));
            if(outputs.containsKey(name)) {
                outputs.put(name, value + outputs.get(name));
            } else {
                outputs.put(name, value);
            }
        }
        List<Twitter> alls = new ArrayList<>();
        for (String key: outputs.keySet()) {
            System.out.println(key + " : " + outputs.get(key));
            alls.add(new Twitter(key, outputs.get(key)));
        }

        alls.stream()
                .sorted((o1, o2) -> o2.value - o1.value)
                .limit(5)
                .forEach(System.out::println);
    }

    private static int calculate(String action, int count) {
        if("like".equals(action)) {
            return count;
        }
        if("reply".equals(action)) {
            return count * 2;
        }

        return count * 3;
    }


}
