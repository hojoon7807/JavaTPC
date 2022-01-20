package f.niosecond;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesManager {
    public static void main(String[] args) {
        FilesManager manager=new FilesManager();
        String fileName="AboutBook.txt";
        Path fromPath = manager.writeAndRead(fileName);
        manager.copyMoveDelete(fromPath,fileName);
    }
    public List<String> getContents(){
        List<String> contents=new ArrayList<>();
        contents.add("ag");
        contents.add("a12313g");
        contents.add("ag12r21rfa");
        contents.add("agasdfs");
        contents.add("asddsdsdsdsdg");
        contents.add("Data"+new Date());
        return contents;
    }
    public Path writeFile(Path path) throws Exception{
        Charset charset=Charset.forName("EUC-KR");
        List<String> contents=getContents();
        StandardOpenOption openOption=StandardOpenOption.CREATE;
        return Files.write(path,contents,charset,openOption);
    }
    public void readFile(Path path) throws Exception{
        Charset charset=Charset.forName("EUC-KR");
        System.out.println("path: "+path);
        List<String> fileContents=Files.readAllLines(path,charset);
        for(String temp:fileContents){
            System.out.println(temp);
        }
        System.out.println();
    }
    public Path writeAndRead(String fileName){
        Path returnPath=null;
        try{
            Path path= Paths.get(fileName);
            returnPath=writeFile(path);
            System.out.println("create file");
            readFile(returnPath);
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnPath;
    }
    public void copyMoveDelete(Path fromPath,String fileName){
        try{
            Path toPath=fromPath.toAbsolutePath().getParent();
            //Make a directory if it is not exist
            Path copyPath=toPath.resolve("copied");
            if(!Files.exists(copyPath)){
                Files.createDirectories(copyPath);
            }
            //Copy file
            Path copiedFilePath=copyPath.resolve(fileName);
            StandardCopyOption copyOption=StandardCopyOption.REPLACE_EXISTING;
            Files.copy(fromPath,copiedFilePath,copyOption);
            //Read file
            System.out.println("copy file contents");
            readFile(copiedFilePath);
            //Move file
            Path moveFilePath=Files.move(copiedFilePath,
                    copyPath.resolve("moved.txt"),copyOption);
            Files.delete(moveFilePath);
            Files.delete(copyPath);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
