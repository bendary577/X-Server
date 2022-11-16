import handler.XServerHandler;
import locator.FileLocator;
import parser.RequestParser;
import processor.RequestProcessor;
import server.XServer;

public class Main {
    public static void main(String[] args) {

        XServer xServer = new XServer(8080);
        RequestParser parser = new RequestParser();
        FileLocator fileLocator = new FileLocator();
        RequestProcessor processor = new RequestProcessor(fileLocator);
        XServerHandler handler = new XServerHandler(xServer, parser, processor);
        handler.initializeServerConfigs();
        handler.runServer();

    }
}