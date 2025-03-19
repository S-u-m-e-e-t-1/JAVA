import java.io.*;

import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName, newFileName, directoryName;
        File file;
        int choice;

        do {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Check if a file exists");
            System.out.println("2. Create a new file");
            System.out.println("3. Write to a file");
            System.out.println("4. Read from a file");
            System.out.println("5. Delete a file");
            System.out.println("6. Rename a file");
            System.out.println("7. Get file information");
            System.out.println("8. Create a directory");
            System.out.println("9. List files in a directory");
            System.out.println("10. Copy a file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name to check: ");
                    fileName = scanner.nextLine();
                    file = new File(fileName);
                    if (file.exists()) {
                        System.out.println("File exists.");
                    } else {
                        System.out.println("File does not exist.");
                    }
                    break;

                case 2:
                    System.out.print("Enter new file name: ");
                    fileName = scanner.nextLine();
                    file = new File(fileName);
                    try {
                        if (file.createNewFile()) {
                            System.out.println("File created successfully.");
                        } else {
                            System.out.println("File already exists.");
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.print("Enter file name to write to: ");
                    fileName = scanner.nextLine();
                    System.out.print("Enter text to write: ");
                    String data = scanner.nextLine();
                    try (PrintWriter writer = new PrintWriter(fileName)) {
                        writer.println(data);
                        System.out.println("Successfully wrote to the file.");
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    System.out.print("Enter file name to read from: ");
                    fileName = scanner.nextLine();
                    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.print("Enter file name to delete: ");
                    fileName = scanner.nextLine();
                    file = new File(fileName);
                    if (file.delete()) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Failed to delete the file.");
                    }
                    break;

                case 6:
                    System.out.print("Enter current file name: ");
                    fileName = scanner.nextLine();
                    System.out.print("Enter new file name: ");
                    newFileName = scanner.nextLine();
                    file = new File(fileName);
                    File newFile = new File(newFileName);
                    if (file.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                    } else {
                        System.out.println("Failed to rename the file.");
                    }
                    break;

                case 7:
                    System.out.print("Enter file name to get info: ");
                    fileName = scanner.nextLine();
                    file = new File(fileName);
                    if (file.exists()) {
                        System.out.println("File name: " + file.getName());
                        System.out.println("Absolute path: " + file.getAbsolutePath());
                        System.out.println("Writeable: " + file.canWrite());
                        System.out.println("Readable: " + file.canRead());
                        System.out.println("File size in bytes: " + file.length());
                    } else {
                        System.out.println("The file does not exist.");
                    }
                    break;

                case 8:
                    System.out.print("Enter directory name to create: ");
                    directoryName = scanner.nextLine();
                    File directory = new File(directoryName);
                    if (directory.mkdir()) {
                        System.out.println("Directory created successfully.");
                    } else {
                        System.out.println("Failed to create directory.");
                    }
                    break;

                case 9:
                    System.out.print("Enter directory name to list files: ");
                    directoryName = scanner.nextLine();
                    directory = new File(directoryName);
                    File[] files = directory.listFiles();
                    if (files != null) {
                        for (File f : files) {
                            if (f.isFile()) {
                                System.out.println("File: " + f.getName());
                            } else if (f.isDirectory()) {
                                System.out.println("Directory: " + f.getName());
                            }
                        }
                    } else {
                        System.out.println("The directory is empty or it does not exist.");
                    }
                    break;

                case 10:
                    System.out.print("Enter source file name: ");
                    fileName = scanner.nextLine();
                    System.out.print("Enter destination file name: ");
                    newFileName = scanner.nextLine();
                    try (FileInputStream fis = new FileInputStream(fileName);
                         FileOutputStream fos = new FileOutputStream(newFileName)) {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = fis.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                        System.out.println("File copied successfully.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
