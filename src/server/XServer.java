package server;

import locator.FileLocator;
import parser.HTTPRequestParser;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class XServer {

    private ServerSocket server;
    private Socket client;
    private int port;

    public XServer(int port){
        this.port = port;
    }

    public void runServer() {
        try{
            this.server = new ServerSocket(this.port);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public void startListening(){
        try{
            if(this.server == null){

            }else{
                this.client = this.server.accept();
            }
        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void closeClientConnection() throws IOException {
        this.client.close();
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public Socket getClient() {
        return client;
    }

    public void setClient(Socket client) {
        this.client = client;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
