package e.io;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "Users/hojunlim/documents/JavaTPC/text";
        sample.makeDir(pathName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }

    public void makeDir(String pathName) {
        File file = new File(pathName);
        file.mkdir();
        System.out.println("Make " + pathName + " result = " + file.mkdir());
    }

    public void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println("Make " + pathName + " result = " + file.isDirectory());
        System.out.println("Make " + pathName + " result = " + file.isFile());
        System.out.println("Make " + pathName + " result = " + file.isHidden());
    }
}

