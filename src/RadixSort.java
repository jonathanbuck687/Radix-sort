import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
public class RadixSort {
    public RadixSort() throws IOException {
        File fillet = new File("some_file.txt");
        Scanner scan = new Scanner(fillet);
        ArrayList<String> start = new ArrayList<>();
        ArrayList<String> finnish = new ArrayList<>();
        while (scan.hasNextLine()) {
            start.add(scan.nextLine());
        }
        if(finnish.isEmpty()) {
            finnish.add(start.get(0));
        }
        else {
            for (int i = 0; i < start.size(); i++) {
                for (int j = 0; j < start.size(); j++) {
                    if (RadixSort.getNum(start.get(i)) < RadixSort.getNum(finnish.get(j))) {
                        finnish.add(j, start.get(i));
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }
    public static int getNum (String l) {
        String alPhabet = "abcdefghijklmnopqrstuvwxyz";
        String alphaBet  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (alPhabet.contains(l)) {
            return alPhabet.indexOf(l);
        }
        return alphaBet.indexOf(l);
    }
}
