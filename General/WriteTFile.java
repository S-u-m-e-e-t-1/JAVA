import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class WriteTFile {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("emp.txt");
        f.write("SURAJ IS OUR FRIEND");
        f.append("He is very good");
        f.close();
    }
}
//public class WriteTFile{
//    public static void main(String[] args) throws IOException {
//    File f=new File("emp.txt");
//        boolean newFile = f.createNewFile();
//        if (newFile){
//            System.out.println("Created Sucess fully at"+f.getPath());
//        }
//        String data = "Hello, this is a sample text written to the file.";
//            FileOutputStream fileOutputStream = new FileOutputStream(f);
//
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//
//            bufferedWriter.write(data);
//
//            bufferedWriter.close();
//    }
//}
/*public class WriteTFile {
    public static void main(String[] args) {
        try {
            File f = new File("emp.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
            String data = "Hello, this is a sample text written to the file.";
            Files.write(Paths.get("emp.txt"), data.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}*/

/*public class WriteTFile {
    public static void main(String[] args) {
        try {
            // Create a new file
            File f = new File("emp.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }


            PrintWriter writer = new PrintWriter(f);


            writer.println("Hello, this is a sample text written to the file.");


            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}*/



