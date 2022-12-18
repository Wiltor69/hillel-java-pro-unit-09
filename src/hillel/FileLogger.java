package hillel;

import java.time.LocalDateTime;

public class FileLogger implements Logger{

    @Override
    public void info(String message) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(start);
        System.out.println("INFO");
        System.out.println(message);

    }

    @Override
    public void debug(String message) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(start);
        System.out.println("DEBUG");
        System.out.println(message);

    }
}
