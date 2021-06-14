import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        FileUtils fileUtils = new FileUtils();

        Scanner scanner = new Scanner(System.in);


//        fileUtils.save("D:\\Notes\\test.txt", "salam khoobi");
//        fileUtils.save("D:\\Notes\\test2.txt", "salam chetori");

//
//        String str = fileUtils.load("D:\\Notes\\test2.txt");
//        System.out.println(str);
//
//    fileUtils.delete("D:\\Notes\\test.txt");
//
//        fileUtils.showAll();
//
        fileUtils.save2("D:\\Notes\\test.txt", "salam khoobi");
//
        fileUtils.showAll2();


    }
}
