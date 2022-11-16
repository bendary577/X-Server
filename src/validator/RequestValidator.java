package validator;

import request.HTTPMethod;

public class RequestValidator implements HTTPRequestValidator{


    public RequestValidator(){}

    @Override
    public HTTPMethod extractRequestMethod(String requestHeader) {
        return null;
    }
}
