import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem5 {



    public static void main(String[] args) {
        List<String> result = ReadFile.read("5.txt");
        double sum = 0;
        for (String input: result) {
            String[] temp = input.split(" ");
            for (int i = 1; i <temp.length ; i++) {
                sum += Integer.parseInt(temp[i].substring(1));
            }

        }
        System.out.println(sum);
        System.out.println(result.size());
        System.out.println(String.format("%.2f", (sum/result.size())));


    }




}
