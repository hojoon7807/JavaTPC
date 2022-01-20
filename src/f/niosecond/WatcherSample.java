package f.niosecond;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

public class WatcherSample extends Thread{
    String dirName;

    public static void main(String[] args)throws Exception {
            String dirName = "/Users/hojunlim/documents/Java";
            String fileName = "WatcherSample.txt";
            WatcherSample sample = new WatcherSample(dirName);
            sample.setDaemon(true);
            sample.start();
            Thread.sleep(1000);
            for (int i = 0; i < 10; i++) {
                sample.fileWriteDelete(dirName, fileName + i);
        }
    }
    public WatcherSample(String dirName) {
        this.dirName=dirName;
    }
    public void run(){
        System.out.println("watcher thread is started");
        System.out.format("DIR=%s\n",dirName);
        addWatcher();
    }
    public void addWatcher(){
        try{
            Path dir= Paths.get(dirName);
            System.out.println("hi");
            WatchService watcher= FileSystems.getDefault().newWatchService();
            dir.register(watcher,ENTRY_CREATE,ENTRY_DELETE,ENTRY_MODIFY);
            while(true){
                WatchKey key=watcher.take();
                List<WatchEvent<?>> eventList=key.pollEvents();
                for(WatchEvent<?> event : eventList) {
                    //이벤트 종류
                    WatchEvent.Kind<?> kind = event.kind();
                    //경로
                    Path paths = (Path)event.context();
                    System.out.println(paths.toAbsolutePath());//C:\...\...\test.txt
                    if(kind.equals(ENTRY_CREATE)) {
                        System.out.println("created something in directory");
                    }else if(kind.equals(ENTRY_DELETE)) {
                        System.out.println("delete something in directory");
                    }else if(kind.equals(ENTRY_MODIFY)) {
                        System.out.println("modified something in directory");
                    }else if(kind.equals(OVERFLOW)) {
                        System.out.println("overflow");
                    }else {
                        System.out.println("hello world");
                    }
                }
                key.reset();
            }
        }catch (IOException|InterruptedException e){
            e.printStackTrace();
        }
    }
    private void fileWriteDelete(String dirName,String fileName){
        Path path=Paths.get(dirName,fileName);
        String contents="Watcher sample";
        StandardOpenOption openOption=StandardOpenOption.CREATE;
        try{
            System.out.println("Write "+fileName);
            Files.write(path,contents.getBytes(),openOption);
            Files.delete(path);
            Thread.sleep(100);
        }catch (IOException|InterruptedException e){
            e.printStackTrace();
        }
    }
}
