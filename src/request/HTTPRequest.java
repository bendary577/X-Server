package request;

/*
e.g. GET www.nku.edu/ HTTP/1.1
*/


/*
GET www.nku.edu HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml; q=0.9;q=0.8
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Cache-Control: max-age=0
Connection: keep-alive
Cookie: …
Host: www.nku.edu
If-Modified-Since: Thu, 26 Sep 2013 17:13:21 GMT
If-None-Match: "6213db-a9f5-4e74c7c9ee942"
User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0)
Gecko/20100101 Firefox/38.0
*/

public class HTTPRequest {
    /*request header*/

    /*request parameters*/

    //method, host, user-agent, accept, accept-language, accept-encoding, connection

    //url requested

    //protocol

    //request body
    private AcceptMIMEType accept;
    private AcceptCharset acceptCharset;
    private AcceptEncoding acceptEncoding;
    private AcceptLanguage acceptLanguage;
    private CacheControl cacheControl;
    private Connection connection;
    private Cookie cookie;
    private String from;
    private String host;
    private byte[] range;
    private String referer;
    private int contentSize;

}
