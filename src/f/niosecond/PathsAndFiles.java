package f.niosecond;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndFiles {
    public static void main(String[] args) {
        PathsAndFiles sample=new PathsAndFiles();
        String dir="/Users/hojunlim/documents/JavaTPC/text/nio2";
        sample.checkPath(dir);
    }
    public void checkPath(String dir){
        Path path= Paths.get(dir);
        System.out.println(path.toString());
        System.out.println("getFileName:"+path.getFileName());
        System.out.println("getNameCount:"+path.getNameCount());
        System.out.println("getParent:"+path.getParent());
        System.out.println("getRoot:"+path.getRoot());
    }
}
