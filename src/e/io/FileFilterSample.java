package e.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample=new FileFilterSample();
        String pathName="/Users/hojunlim/documents/JavaTPC/text";
        sample.checkList(pathName);
    }
    public void checkList(String pathName){
        File file;
        try{
            file=new File(pathName);
            File[] mainFileList=file.listFiles();
            File[] mainFileList2=file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if(pathname.isFile()){
                        String filename=pathname.getName();
                        if(filename.endsWith(".png")) return true;
                    }
                    return false;
                }
            });
            for(File tempFile:mainFileList2){
                System.out.println(tempFile.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
