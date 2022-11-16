package locator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLocator implements RequestedFileLocator{

    @Override
    public File getFile(String filePath, String fileName) {
        File file = new File(fileName);
        if (file.exists()) return file;
        if (fileName.charAt(0) != '/') return file;
        return new File(fileName.substring(1));
    }

    @Override
    public Path getIndexFile() {

        Path path = Paths.get("C:\\Users\\mohamed.bendary\\IdeaProjects\\X-Web Server", "index.html");
        if (Files.notExists(path)) {
            System.out.println("");
        }
        return path;
    }

    @Override
    public File getFileNotFound(String path, String name) {
        return null;
    }

}
