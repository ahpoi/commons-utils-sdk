package com.ahpoi.commons.utils.aws.lambda.model.proxy.request;

import java.util.Map;

public class Request {

    private String resource;

    private String path;

    private String httpMethod;

    private Map<String, String> headers;

    private Map<String, String> queryStringParameters;

    private Map<String, String> pathParameters;

    private Map<String, String> stageVariables;

    private RequestContext requestContext;

    private String body;

    private boolean isBase64Encoded;

    public String getResource() {
        return resource;
    }

    public String getPath() {
        return path;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getQueryStringParameters() {
        return queryStringParameters;
    }

    public Map<String, String> getPathParameters() {
        return pathParameters;
    }

    public Map<String, String> getStageVariables() {
        return stageVariables;
    }

    public RequestContext getRequestContext() {
        return requestContext;
    }

    public String getBody() {
        return body;
    }

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void setQueryStringParameters(Map<String, String> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    public void setPathParameters(Map<String, String> pathParameters) {
        this.pathParameters = pathParameters;
    }

    public void setStageVariables(Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    public void setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    @Override
    public String toString() {
        return "Request{" +
                "resource='" + resource + '\'' +
                ", path='" + path + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", headers=" + headers +
                ", queryStringParameters=" + queryStringParameters +
                ", pathParameters=" + pathParameters +
                ", stageVariables=" + stageVariables +
                ", requestContext=" + requestContext +
                ", body='" + body + '\'' +
                ", isBase64Encoded=" + isBase64Encoded +
                '}';
    }

}
