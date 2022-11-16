package processor;

import clientCommunicator.ClientCommunicator;
import locator.FileLocator;

import java.io.File;
import java.nio.file.Path;

public class RequestProcessor implements HTTPRequestProcessor{

    private FileLocator fileLocator;
    private ClientCommunicator clientCommunicator;

    public RequestProcessor(FileLocator fileLocator){
        this.fileLocator = fileLocator;
    }

    @Override
    public void processDefaultGetRequest(String request) {
        //reply with 200 header
        Path path = this.fileLocator.getIndexFile();

    }

    @Override
    public void processGetRequest(String request) {

    }

    @Override
    public void getServerHTTPOptions() {

    }


}
