import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem7 {



    public static void main(String[] args) {
        Map<Integer , Integer> out = new HashMap<>();
        List<String> result = ReadFile.read("7.txt");
        int sum = 0;
        int day = 4;
        for (String input: result) {
            if(day > 7) {
                day = 1;
            }
            String[] temp = input.split(" ");
            for (int i = 1; i <temp.length ; i++) {
                int m = Integer.parseInt(temp[i].substring(1));
                int type = day % 7;
                if(out.containsKey(type)) {
                    out.put(type, out.get(type) + m);
                } else {
                    out.put(type, m);
                }
                sum += m;
            }
            day++;
        }
        System.out.println("Mon " + getData(out.get(1)));
        System.out.println("Tue " + getData(out.get(2)));
        System.out.println("Wed " + getData(out.get(3)));
        System.out.println("Thu " + getData(out.get(4)));
        System.out.println("Fri " + getData(out.get(5)));
        System.out.println("Sat " + getData(out.get(6)));
        System.out.println("Sun " + getData(out.get(0)));


    }

    private static int getData(Integer input) {
        return input == null ? 0 : input;
    }




}
