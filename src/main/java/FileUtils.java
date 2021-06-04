import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class FileUtils {



    public Path getPath(String pathName,String fileName) {
        var fln = new FileName(fileName);
        fileName = fln.addTimeStampToFileName()
                .and()
                .addFileExtensionToFileName("txt")
                .getFileName();
        String uri = pathName + fileName;
        return Path.of(uri);
    }





    public boolean writeFile(List<String> lines,Path path) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(lines.stream()
                    .reduce((sum,line) ->  sum + "\n"  + line)
                    .get());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}
