package parser;

import request.HTTPMethod;

public class RequestParser implements HTTPRequestParser{

    @Override
    public String getMethod(String requestHeader) {
        return requestHeader.substring(0,requestHeader.indexOf(' ') );
    }

    @Override
    public String getResourcePath(String request) {
        if(request.length() == 0){
            return null;
        }
        String fromPathToHttpVersion = request.substring(request.indexOf(' ')+1);
        String requestPath = fromPathToHttpVersion.substring(0, fromPathToHttpVersion.indexOf(' '));
        if (requestPath.equals("")) return "index.html";
        if (requestPath.charAt(requestPath.length()-1) == '/') requestPath += "index.html";
        return requestPath;
    }

    @Override
    public String getHTTPVersion() {
        return null;
    }
}
