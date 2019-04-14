package wyjatki_2;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DirectoryScanner {
    public static void scan(String filePath, String fileName) {
        if(fileFoundScanning(filePath, fileName)) {
            File file = new File(filePath + "/" + fileName);
            Log.log(file.getAbsolutePath());
            removeFile(file);
        }
    }

    //TODO NIESTETY NIEDOKONCZONE
    public static boolean fileFoundScanning(String filePath, String fileName) {
        try {
            return fileFound(filePath, fileName);
        }catch(Exception e) {

            System.out.println(e);

            try{
                TimeUnit.MINUTES.sleep(1);
            } catch(Exception ex) {
                System.out.println(ex);
            }

            return fileFoundScanning(filePath, fileName);
        }
        return true;
    }

    public static boolean fileFound(String filePath, String fileName) throws MyException {
        File folder = new File(filePath);
        if(!folder.isDirectory()) {
            System.out.println("The path is not a directory.");
            return false;
        }
        for (File fileEntry : folder.listFiles()) {
            if (fileName == fileEntry.getName()) {
                return true;
            }
        }
        throw new MyException("File not found!");
    }

    public static void removeFile(File file) {
        if(file.delete()){
            System.out.println("File " + file.getName() + " deleted from the directory");
        }else System.out.println("File " + file.getName() + " doesn't exist in this directory");
    }
}
