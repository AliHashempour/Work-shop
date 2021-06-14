package files2;

import java.io.*;

public class FileUtils {

    public void save(String fileName, Note note) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(note);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void load(String fileName) {
        try (FileInputStream fi = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fi);
            Note note = (Note) objectInputStream.readObject();
            System.out.println("\ndate: " + note.getDate() + "\ntitle: " + note.getTitle() +
                    "\ntext: " + note.getText());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
