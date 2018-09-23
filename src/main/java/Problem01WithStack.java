import java.util.Stack;

public class Problem01WithStack {

    public static void main(String[] args) {
        String input1 = "995144900824012405238259418456758068524921";
        String input2 = "879161138176194604342893336019619756243251";


        Stack<Integer> a = convertToStack(input1);
        Stack<Integer> b = convertToStack(input2);
        int ทด = 0;
        Stack<Integer> result = new Stack<>();

        while (!a.empty()) {
            int tempA = a.pop();
            int tempB = b.pop();
            int sum = tempA + tempB + ทด;
            if(sum > 9) {
                result.push(sum - 10);
                ทด = 1;
            } else {
                result.push(sum);
                ทด = 0;
            }
        }
        if(ทด == 1) {
            result.push(1);
        }
        while(!result.empty()) {
            System.out.print(result.pop());
        }

    }

    private static Stack<Integer> convertToStack(String input) {
        Stack<Integer> a = new Stack<>();
        int length = input.length();
        for (int i = 0; i< length; i++) {
            a.push(input.charAt(i) - 48);
        }
        return a;
    }


}
