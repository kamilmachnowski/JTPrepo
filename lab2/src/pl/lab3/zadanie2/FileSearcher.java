package pl.lab3.zadanie2;

import java.io.*;

import static java.lang.Thread.sleep;

public class FileSearcher {
    private String directoryPath;
    private String fileToSearch;

    FileSearcher(String directoryPath, String fileToSearchPath) {
        this.directoryPath = directoryPath;
        this.fileToSearch = fileToSearchPath;
    }

    public void fileFinder() throws FileNotFoundException, NullPointerException, InterruptedException {
        File directory = new File(this.directoryPath);
        File[] matchingFiles = directory.listFiles((dir1, name) -> name.startsWith(fileToSearch));
        String matchinFilesString = matchingFiles[0].toString();
        try {
            throw new NullPointerException();
        } catch (NullPointerException ex) {
            matchinFilesString="";
        }

        if (matchinFilesString.isEmpty()) {
            try {
                throw new FileNotFoundException("Nie ma takiego pliku");
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
                sleep(60000);
            }
        } else {
            PrintWriter zapis = new PrintWriter("logs.txt");
            zapis.printf(fileToSearch);
            zapis.close();
        }
    }
}