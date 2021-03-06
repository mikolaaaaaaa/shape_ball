package reader;

import exception.BallException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BallFileReaderTest {
    @Test
    public void testReadBallFromFile() throws BallException {
        List<String> expected = List.of(
                "1 1 1 1 1 1 1",
                "1a 1 1 1 1 1",
                "2 2 2 2 2 2 2"
        );
        String path = "C:\\Users\\Mikola\\IdeaProjects\\Shape\\src\\main\\resources\\data.txt";
        List<String> actual = BallFileReader.readBallFromFile(path);
        Assertions.assertEquals(expected, actual);
    }
}
