package model;

import java.io.File;
import java.text.SimpleDateFormat;

public class DiskFile extends DiskElement {
    public DiskFile(File file) {
        super(file);
    }

    protected void print(int depth) {
        SimpleDateFormat template = new SimpleDateFormat("yyyy-MM-dd");
        String formDate = template.format(lastModifiedMS);

        String toPrint = "";
        for (int i = 0; depth > i; i++)
            toPrint += "-";
        toPrint += file.getName();

        System.out.printf("%-80s %-80s %-80s %d \n", toPrint, "P", formDate, file.length());
    }
}
