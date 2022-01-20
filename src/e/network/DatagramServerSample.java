package e.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerSample {
    public static void main(String[] args) {
        DatagramServerSample sample=new DatagramServerSample();
        sample.startServer();
    }
    public void startServer(){
        DatagramSocket server=null;
        try{
            server=new DatagramSocket(9999);
            int bufferLength=256;
            byte[] buffer=new byte[bufferLength];
            DatagramPacket packet
                    = new DatagramPacket(buffer,bufferLength);
            while (true){
                System.out.println("server:waiting for request");
                server.receive(packet);
                int dataLength=packet.getLength();
                System.out.println("server:received. length="+dataLength);
                String data=new String(packet.getData(),0,dataLength);
                System.out.println("data "+data);
                if (data.equals("EXIT")) {
                    System.out.println("stop");
                    break;
                }
                System.out.println("-----------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(server!=null){
                try{
                    server.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
