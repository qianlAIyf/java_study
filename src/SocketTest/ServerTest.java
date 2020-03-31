package SocketTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServerTest extends Thread{
    private ServerSocket serverSocket;

    public ServerTest(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run(){
        while(true){
            try {
                System.out.println("waiting for remote connection:" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("remote host address:" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("connecting to" + server.getLocalSocketAddress());
                server.close();
            } catch (SocketTimeoutException s){
                System.out.println("Socket time out");
            } catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String [] args){
        int port = Integer.parseInt(args[0]);
        try {
            Thread t = new ServerTest(port);
            t.run();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
