package Model;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperation implements AutoCloseable {
    private static User user;
    public FileOperation(User inPerson) {
        user = inPerson;
    }

    public void writePersonToFile() throws IOException {
        String fileName = user.getSurName() + ".txt";
        String data = user.getFullData()+"\n";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(data);
            writer.flush();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }


    @Override
    public void close(){
        System.gc();
    }
}
