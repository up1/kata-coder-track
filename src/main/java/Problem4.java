import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {



    public static void main(String[] args) {
        Map<String, String> datas = new HashMap<>();
        datas.put("[C]", "D");
        datas.put("[Dm]", "Em");
        datas.put("[Em]", "F#m");
        datas.put("[F]", "G");
        datas.put("[G]", "A");
        datas.put("[Am]", "Bm");
        List<String> result = ReadFile.read("4.txt");
        for (String input: result) {
            String[] temp = input.split(" ");
            for (String t : temp) {
                if(t.startsWith("[") && t.endsWith("]")) {
                    System.out.print("[" + datas.get(t) + "] " );
                } else {
                    System.out.print(t + " ");
                }
            }
            System.out.println();
        }


    }




}
