package code.challenge;

import java.util.ArrayList;
import java.util.List;

class NegativeMirror {


    private final List<String> inputs;

    NegativeMirror(List<String> inputs) {
        this.inputs = inputs;
    }

    List<String> process() {
        List<String> outputs = new ArrayList<>();
        for (String input : inputs) {
            String flip = hFlip(input);
            String output = mirror(flip);
            outputs.add(output);
        }
        return outputs;
    }

    String hFlip(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

    private String mirror(String flip) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < flip.length(); i++) {
            output.append(flip.charAt(i) == 48 ? 1 : 0);
        }
        return output.toString();
    }
}
