import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem6 {



    public static void main(String[] args) {
        Map<String, Integer> out = new HashMap<>();
        List<String> result = ReadFile.read("6.txt");
        int sum = 0;
        for (String input: result) {
            String[] temp = input.split(" ");
            for (int i = 1; i <temp.length ; i++) {
                int m = Integer.parseInt(temp[i].substring(1));
                String type = temp[i].substring(0,1);
                if(out.containsKey(type)) {
                    out.put(type, out.get(type) + m);
                } else {
                    out.put(type, m);
                }
                sum += m;
            }
        }
        System.out.println("food " + out.get("f"));
        System.out.println("game " + out.get("g"));
        System.out.println("movie " + out.get("m"));
        System.out.println("stationery " + ((out.get("s") == null ? 0 : out.get("s"))));
        System.out.println("transportation " + out.get("t"));
        System.out.println("TOTAL " + sum);


    }




}
