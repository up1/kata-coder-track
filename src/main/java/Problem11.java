import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem11 {

    public static void main(String[] args) {
        Map<String , String> outputs = new HashMap<>();

        List<String> result = ReadFile.read("11.txt");
        for (String input: result) {
            String[] datas = input.split(" ");
            String name = datas[1];
            if(outputs.containsKey(name)) {
                outputs.remove(name);
            } else {
                outputs.put(name, datas[0]);
            }

        }
        List<String> alls = new ArrayList<>();
        for (String key: outputs.keySet()) {
            alls.add(outputs.get(key));
        }

        alls.stream()
                .sorted()
                .forEach(System.out::println);
    }


}
