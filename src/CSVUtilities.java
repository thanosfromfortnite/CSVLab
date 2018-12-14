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
            numColumns = l.split(",").length;
            while (l != null) {
                String[] att = l.split(",");
                ThisIsACryForHelp data = new ThisIsACryForHelp(att);
                CSVData.add(data);
                l = br.readLine();
            }
        }
        catch (IOException dumbassError) {
            dumbassError.printStackTrace();
        }
    }
    public List<String> getColumnHeaders() {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < CSVData.size(); i ++) {
            a.add(CSVData.get(i).getThing(0));
        }
        return a;
    }

    public List<String> getDataString(int column) {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < CSVData.get(column).size(); i ++) {
            a.add(CSVData.get(column).getThing(i));
        }
        return a;
    }

    public List<Integer> getDataInt(int column) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < CSVData.get(column).size(); i ++) {
            a.add(Integer.getInteger(CSVData.get(column).getThing(i)));
        }
        return a;
    }

    public List<Double> getDataDouble(int column) {
        ArrayList<Double> a = new ArrayList<>();
        for (int i = 0; i < CSVData.get(column).size(); i ++) {
            a.add(Double.valueOf(CSVData.get(column).getThing(i)));
        }
        return a;
    }
}
