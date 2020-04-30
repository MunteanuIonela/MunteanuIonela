package proiect.pao;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVUtil {


    private static final char defaultSeparator = ',';


    private static String csvFile;

    public CSVUtil(String csvName) {
        csvFile = csvName;
    }

    public ArrayList<List<String>> read() throws Exception {
        ArrayList<List<String>> dataArray = new ArrayList<>();
        Scanner scanner = new Scanner(new File(csvFile));
        List<String> line;
        scanner.nextLine();
        while (scanner.hasNext()) {
            line = parseLine(scanner.nextLine());
            dataArray.add(line);
        }
        scanner.close();
        return dataArray;
    }

    public static List<String> parseLine(String csvLine) {
        return parseLine(csvLine, defaultSeparator);
    }

    public static List<String> parseLine(String csvLine, char separators) {
        return parseLine(csvLine, separators);
    }


}



