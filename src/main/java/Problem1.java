import java.util.List;

public class Problem1 {

    public static void main(String[] args) {
        List<String> result = ReadFile.read("2.txt");
        String input1 = "0";
        for (String input: result) {
            input1 = calculate(input1, input);
        }
        System.out.println(input1);

    }

    private static String calculate(String input1, String input2) {
        if(input1.length() < input2.length()) {
            String temp = input1;
            input1 = input2;
            input2 = temp;
        }
        String result = "";
        int over = 0;
        for (int i=input1.length()-1; i>=0; i--) {
            int a = input1.charAt(i) - 48;
            int b = 0;
            try {
                b = Integer.parseInt(input2.substring(input2.length()-1));
                input2 = input2.substring(0, input2.length()-1);
            }catch (StringIndexOutOfBoundsException e) {
                b = 0;
            }

            int temp = 0;
            if(a + b + over > 9) {
                temp = (a + b + over) - 10;
                over = 1;
            } else {
                temp = a + b + over;
                over = 0;
            }
            result =  temp + result;

        }
        if(over == 1) {
            return over + result;
        }
        return result;
    }



}
