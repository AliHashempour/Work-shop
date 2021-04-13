import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class run {

    public static void main(String[] args) throws InterruptedException {

        MusicCollection rap = new MusicCollection();
        boolean state = true;

        int Index;
        while (state) {
            run.ShowMenu();
            Scanner scanner = new Scanner(System.in);
            Index = scanner.nextInt();
            switch (Index) {
                case 1: {
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    int y = scanner.nextInt();
                    rap.addFile(name, y);
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    int index;
                    index = scanner.nextInt();
                    rap.removeFile(index);
                    Thread.sleep(1000);

                    break;
                }
                case 3: {
                    rap.listAllFiles();
                    Thread.sleep(1000);

                    break;
                }
                case 4: {
                    int index;
                    index = scanner.nextInt();
                    rap.startPlaying(index);
                    Thread.sleep(1000);

                    break;
                }
                case 8: {
                    System.out.println("bye");
                    state = false;
                    break;
                }
                case 5: {
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    int y = scanner.nextInt();
                    rap.addFavorite(name, y);
                    Thread.sleep(1000);
                    break;

                }

                case 6: {
                    rap.favotiteList();
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    scanner.nextLine();
                    rap.search(scanner.nextLine());
                    Thread.sleep(1000);
                    break;
                }

            }
        }
    }

    public static void ShowMenu() {
        System.out.println("1)Add a music");
        System.out.println("2)remove a music");
        System.out.println("3)Show the list");
        System.out.println("4)play a music");
        System.out.println("5)add favorite");
        System.out.println("6)fav list");
        System.out.println("7)search");
        System.out.println("8)exit");
    }
}
