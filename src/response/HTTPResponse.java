package response;

import request.HTTPMethod;
import url.URL;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

/*
HTTP/1.1 200 OK
Fri, 27 Sep 2013 15:23:15 GMT
Accept-Ranges: bytes
Connection: close
Content-Encoding: gzip
Content-Length: 9163
Content-Type: text/html
ETag: "6218989-ac0c-4e75c7b6d72e0"
Last-Modified: Fri, 27 Sep 2013 12:18:20 GMT
Server: Apache
Vary: Accept-Encoding,User-Agent
*/

public class HTTPResponse {

    /*parameters */

    //method, server, last-modified, content-length, connection, content-type

    private int age;
    private HTTPMethod allow;
    private int contentLength;
    private LocalDateTime expires;
    private LocalDateTime lastModified;
    private URL location;
    private String server;
    private HashMap<String, String> setCookie;
    private int retryAfter;
    private List<String> via;

    private Byte[] requestBody;
}
