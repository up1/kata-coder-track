import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    public static List<String> read(String fileName) {
        List<String> results = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            results = stream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }

}
