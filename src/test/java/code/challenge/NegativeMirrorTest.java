package code.challenge;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class NegativeMirrorTest {

    @Test
    public void first_line_should_be_horizontal_flip() {
        List<String> input = Collections.singletonList("01101");
        NegativeMirror negativeMirror = new NegativeMirror(input);
        String output = negativeMirror.hFlip("01101");
        assertEquals("10110", output);
    }

    @Test
    public void first_line_should_be_mirror() {
        List<String> input = Collections.singletonList("01101");
        NegativeMirror negativeMirror = new NegativeMirror(input);
        List<String> output = negativeMirror.process();
        assertEquals(Collections.singletonList("01001"), output);
    }

    @Test
    public void second_line_should_be_mirror() {
        List<String> input = Arrays.asList("01101", "11001");
        NegativeMirror negativeMirror = new NegativeMirror(input);
        List<String> output = negativeMirror.process();
        assertEquals(asList("01001", "01100"), output);
    }

    @Test
    public void third_line_should_be_mirror() {
        List<String> input = Arrays.asList("01101", "11001", "00111");
        NegativeMirror negativeMirror = new NegativeMirror(input);
        List<String> output = negativeMirror.process();
        assertEquals(asList("01001", "01100", "00011"), output);
    }

}