package validator;

import request.HTTPMethod;

public interface HTTPRequestValidator {

    public HTTPMethod extractRequestMethod(String requestHeader);
}
