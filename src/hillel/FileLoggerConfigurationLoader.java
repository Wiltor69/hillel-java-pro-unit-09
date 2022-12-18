package hillel;

import java.io.File;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public static FileLoggerConfiguration load (String name, String level, long size) throws IOException {
        File filename = new File(name);
        if (filename.length()>size)
        {
            filename.createNewFile();
        }
        FileLoggerConfiguration flc = new FileLoggerConfiguration(filename.getName() , level, size);

        return flc;
    }
}
