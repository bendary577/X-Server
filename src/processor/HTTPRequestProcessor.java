package processor;

public interface HTTPRequestProcessor {
    public void processDefaultGetRequest(String request);
    public void processGetRequest(String request);
    public void getServerHTTPOptions();
}
