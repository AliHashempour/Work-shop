import java.io.*;
import java.lang.reflect.Array;

public class FileUtils {

    public void save(String fileName, String data) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String load(String fileName) {
        String result = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null) {
                result = result + nextLine;
                result = result + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public void delete(String fileName) {
        try {
            File f = new File(fileName);           //file to be delete
            if (f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            } else {
                System.out.println("failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAll() throws IOException {
        File[] files;
        File file = new File("D:\\Notes");
        files = file.listFiles();
        assert files != null;
        for (File myFiles : files) {
            System.out.println(myFiles.getName());
            BufferedReader r = new BufferedReader(new FileReader(myFiles));
            int ch;
            int cnt = 0;
            while ((ch = r.read()) != -1 && (cnt < 8)) {

                System.out.print((char) ch);
                cnt++;
            }
            System.out.println("...");

        }

    }


    public void save2(String fileName, String data) {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            String s = data;
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void load2(String fileName) {
        try {
            FileInputStream fin = new FileInputStream(fileName);
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void showAll2() throws IOException {
        File[] files;
        File file = new File("D:\\Notes");
        files = file.listFiles();
        assert files != null;
        for (File myFiles : files) {
            System.out.println(myFiles.getName());
            FileInputStream fin = new FileInputStream(myFiles);
            int ch;
            int cnt = 0;
            while ((ch = fin.read()) != -1 && (cnt < 8)) {

                System.out.print((char) ch);
                cnt++;
            }
            System.out.println("...");

        }

    }

}


