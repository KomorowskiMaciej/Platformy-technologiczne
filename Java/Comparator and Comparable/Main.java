import model.DiskDirectory;

import java.io.File;

public class Main {

    public static void main(String[] args) {
       new DiskDirectory(new File("C:\\Users\\Maciek\\Documents\\Test"),
             //  "Comparator"
               "Comparable"
       ).print(0);
    }
}
