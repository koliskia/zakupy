import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Zapis {
    public static void Zapis(String doZapis) {
        String end = "ile_krokow,ile_zostalo" + doZapis;
        try {
            Files.writeString(Paths.get("zapis.csv"), end, StandardOpenOption.CREATE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
