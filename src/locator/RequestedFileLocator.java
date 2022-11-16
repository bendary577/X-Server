package locator;

import java.io.File;
import java.nio.file.Path;

public interface RequestedFileLocator {

    public File getFile(String path, String name);
    public Path getIndexFile();
    public File getFileNotFound(String path, String name);
}
