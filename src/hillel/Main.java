package hillel;


import javax.imageio.stream.FileImageOutputStream;
import java.io.*;



public class Main {

    public static void main(String[] args) {
        Logger log = new FileLogger();

        log.info("This is start program");
        System.out.println("_______________________________________________");
        for (int i = 0; i < 10; i++) {
            log.debug("This program work good");
        }
        System.out.println("_______________________________________________");
        log.info("Program end");

        FileLoggerConfiguration flc = new FileLoggerConfiguration("logger.txt", "DEBUG", 64);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("logger.txt"))) {
            oos.writeObject(flc);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("logger.txt"))) {

            System.out.println(ois.readObject().toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


    






}
