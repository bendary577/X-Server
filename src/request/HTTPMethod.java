package request;

//For security purposes, you might disallow your web server from handling the unsafe methods
public enum HTTPMethod {
    GET("GET"),             //(SAFE)
    POST("POST"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    PATCH("PATCH"),         //Uploads the attached resource to modify some content on the web server
    CONNECT("CONNECT"),     //Creates a TCP/IP tunnel between the client machine and the web server (SAFE)
    HEAD("HEAD"),           //Requests just the HTTP message header as the response (SAFE)
    PUT("PUT"),             //Uploads the attached resource to the web server
    TRACE("TRACE"),         //Returns the received request to see if any changes have occurred by an intermediate server (e.g., a proxy server) (SAFE)
    OPTIONS("OPTIONS");     //Returns the list of HTTP methods that the given web serve will respond to (SAFE)

    private String methodName;
    private HTTPMethod(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
