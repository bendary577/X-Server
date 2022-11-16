package parser;

import request.HTTPMethod;

public interface HTTPRequestParser {

    public String getMethod(String requestHeader);
    public String getResourcePath(String request);

    public String getHTTPVersion();
}
