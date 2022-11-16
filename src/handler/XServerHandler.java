package handler;

import locator.FileLocator;
import parser.HTTPRequestParser;
import processor.RequestProcessor;
import request.HTTPMethod;
import server.XServer;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class XServerHandler {

    private XServer xServer;
    private HTTPRequestParser parser;
    private RequestProcessor processor;

    public XServerHandler(XServer xServer, HTTPRequestParser parser, RequestProcessor processor) {
        this.xServer = xServer;
        this.parser = parser;
        this.processor = processor;
    }

    public void initializeServerConfigs(){
        this.xServer.runServer();
        this.xServer.startListening();
    }

    public void runServer() {
        try{
            PrintStream printStream = new PrintStream(this.xServer.getClient().getOutputStream());              //output stream to client
            DataInputStream dataInputStream = new DataInputStream(this.xServer.getClient().getInputStream());   //input stream from client
            String httpRequest, methodName;
            while(true){
                httpRequest = dataInputStream.readLine();
                if((methodName = this.parser.getMethod(httpRequest)) != null){
                    switch (methodName) {
                        case "GET" -> this.processor.processGetRequest(httpRequest);
                        default -> this.processor.getServerHTTPOptions();
                    };
                }
                this.xServer.closeClientConnection();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }



}
