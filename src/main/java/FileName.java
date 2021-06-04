import java.io.File;
import java.time.LocalDateTime;

public class FileName {
    private String fileName;
    public FileName(String  fileName) {
        this.fileName = fileName;
    }

    public FileName addFileExtensionToFileName(String extension)  {
        StringBuilder sb = new StringBuilder(fileName);
        sb.append('.');
        sb.append(extension);
        fileName = sb.toString();
        return this;
    }

    public FileName addTimeStampToFileName() {
        StringBuilder sb = new StringBuilder(fileName);
        String now = LocalDateTime.now().withNano(0).toString();
        String timeStamp =  now.replaceAll(":","");
        sb.append(timeStamp);
        fileName = sb.toString();
        return this;
    }

    public FileName and() {
        return this;
    }





    public String getFileName() {
        return fileName;
    }
}
