package e.network;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample=new SocketClientSample();
        sample.sendSocketSample();
    }
    public void sendSocketSample(){
        for(int i=0;i<3;i++){
    sendSocketData("I like you "+new Date());
        }
        sendSocketData("EXIT");
    }
    public void sendSocketData(String data){
        Socket socket=null;
        try{
            System.out.println("Client:connect");
            socket=new Socket("127.0.0.1",9999);
            System.out.println("Client connect status="+socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream=socket.getOutputStream();
            BufferedOutputStream out=new BufferedOutputStream(stream);
            byte[] bytes=data.getBytes();
            out.write(bytes);
            System.out.println("Client sent data");
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
