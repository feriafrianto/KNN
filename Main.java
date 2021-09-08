import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String TrainingData = "ruspini.csv";
    public static void main(String[] args) {
        ArrayList<String[]> DataTesting = new ArrayList<>();
        try {
            File file = new File(TrainingData); 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String str = "";

            while (str != null) {
                str = br.readLine();

                if (str != null) 
                DataTesting.add(str.split(","));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("Kesalahan saat membaca file");
        } finally {
            if (DataTesting.size() > 0) {
                // int rowSize = DataTesting.size();
                // int columnSize = DataTesting.get(0).length;
                System.out.println(Arrays.deepToString(DataTesting.toArray()));
            }
        }
    }
}