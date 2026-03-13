import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class RadixSortTest {

    @Test
    void main() throws IOException {

        File t1key = new File("sort_key.txt");
        Assertions.assertTrue(Files.mismatch(RadixSort.main("sort").toPath(), t1key.toPath()) == -1);


        File t2key = new File("sort(1)_key.txt");
        Assertions.assertTrue(Files.mismatch(RadixSort.main("sort(1)").toPath(), t2key.toPath()) == -1);


        File t3key = new File("sort(2)_key.txt");
        Assertions.assertTrue(Files.mismatch(RadixSort.main("sort(2)").toPath(), t3key.toPath()) == -1);
    }
}


