import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private String filePath;

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<UserSession> Read(){
        ArrayList<UserSession> records = new ArrayList<UserSession>();

        try{
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String s : lines) {
                String[] splitLine = s.split(";");
                records.add(new UserSession(splitLine));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return records;
    }
}