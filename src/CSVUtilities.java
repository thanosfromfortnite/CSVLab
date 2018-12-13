import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

public class CSVUtilities {
    private ArrayList<ThisIsACryForHelp> CSVData = new ArrayList<>();
    int numColumns = 0;

    public CSVUtilities(File csvFile) {
        Path path = Paths.get(csvFile.toString());

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) {
            String l = br.readLine();

            while (l != null) {
                String[] att = l.split(",");
                ThisIsACryForHelp data = new ThisIsACryForHelp(att);
                CSVData.add(data);
                numColumns ++;
                l = br.readLine();
            }
        }
        catch (IOException dumbassError) {
            dumbassError.printStackTrace();
        }
    }

    public List<String> getColumnHeaders() {

    }

}


