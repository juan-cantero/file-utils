import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var fileUtil = new FileUtils();

        String pathName = "src";
        String fileName= "dictamen";

        Path path = fileUtil.getPath(pathName,fileName);

        fileUtil.writeFile(List.of("hola","chau"),path);

    }
}
