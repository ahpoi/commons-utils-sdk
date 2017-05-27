package com.ahpoi.commons.utils.aws.lambda.model.proxy.request;

public class RequestContext {

    private String accountId;

    private String resourceId;

    private String stage;

    private String requestId;

    private Identity identity;

    private String resourcePath;

    private String httpMethod;

    private String apiId;

    public String getAccountId() {
        return accountId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getStage() {
        return stage;
    }

    public String getRequestId() {
        return requestId;
    }

    public Identity getIdentity() {
        return identity;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getApiId() {
        return apiId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    @Override
    public String toString() {
        return "RequestContext{" +
                "accountId='" + accountId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", stage='" + stage + '\'' +
                ", requestId='" + requestId + '\'' +
                ", identity=" + identity +
                ", resourcePath='" + resourcePath + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", apiId='" + apiId + '\'' +
                '}';
    }
}
