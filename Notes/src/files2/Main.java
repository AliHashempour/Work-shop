package files2;

public class Main {

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        Note note1 = new Note("ali", "raft", "2020");
        fileUtils.save("obj", note1);
        fileUtils.load("obj");
    }
}
