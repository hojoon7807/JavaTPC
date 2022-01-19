package e.io;

import java.io.*;
import java.util.Scanner;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile sample=new ManageTextFile();
        int numberCount=10;
        String fullPath="/Users/hojunlim/documents/JavaTPC/text/numbers.txt";
        sample.writeFile(fullPath,numberCount);
        sample.readFile(fullPath);
        sample.readFileWithScanner(fullPath);
    }
    public void writeFile(String fileName,int numberCount){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            fileWriter=new FileWriter(fileName,false);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(int i=0;i<=numberCount;i++){
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.newLine();
            }
            System.out.println("success");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedWriter!=null){
                try{
                    bufferedWriter.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if(fileWriter!=null){
                try{
                    fileWriter.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
    public void readFile(String fileName){
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try{
            fileReader=new FileReader(fileName);
            bufferedReader=new BufferedReader(fileReader);
            String data;
            while((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        } catch(IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedReader!=null){
                try{
                    bufferedReader.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if(fileReader!=null){
                try{
                    fileReader.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
    public void readFileWithScanner(String fileName){
        File file=new File(fileName);
        Scanner scanner=null;
        try{
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("success");
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}
