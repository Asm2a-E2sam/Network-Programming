package task2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a url: ");
        String url = scanner.nextLine();
        accessWebsite(url);
    }

    private static void accessWebsite(String url) {
        BufferedReader br = null;
        File theFile = new File("file.html");
        FileWriter file;

        try {
            URL my_url = new URL(url);
            URLConnection urlConnection = my_url.openConnection();
            InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
            br = new BufferedReader(isr);
            file = new FileWriter(theFile);

            String line;
            while ((line = br.readLine()) != null) {
                file.write(line);
            }
            file.close();

        } catch (IOException exception) {
            System.out.println("\n Cannot access URL");
            System.exit(1);
        } finally {
            System.out.println("\n Closing the connection");
            try {
                br.close();
                System.exit(1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}