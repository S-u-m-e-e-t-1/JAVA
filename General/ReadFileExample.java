import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

//public class ReadFileExample {
//    public static void main(String[] args) {
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("emp.txt"));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


//public class ReadFileExample {
//    public static void main(String[] args) {
//        try {
//            File file = new File("emp.txt");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}



public class ReadFileExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("emp.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//public class ReadFileExample {
//    public static void main(String[] args) {
//        try {
//            List<String> lines = Files.readAllLines(Paths.get("emp.txt"));
//            for (String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
