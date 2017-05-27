package com.ahpoi.commons.utils.aws.lambda.model.proxy.request;

public class Identity {

    private String cognitoIdentityPoolId;

    private String accountId;

    private String cognitoIdentityId;

    private String caller;

    private String apiKey;

    private String sourceIp;

    private String cognitoAuthenticationType;

    private String cognitoAuthenticationProvider;

    private String userArn;

    private String userAgent;

    private String user;

    public String getCognitoIdentityPoolId() {
        return cognitoIdentityPoolId;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getCognitoIdentityId() {
        return cognitoIdentityId;
    }

    public String getCaller() {
        return caller;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public String getCognitoAuthenticationType() {
        return cognitoAuthenticationType;
    }

    public String getCognitoAuthenticationProvider() {
        return cognitoAuthenticationProvider;
    }

    public String getUserArn() {
        return userArn;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getUser() {
        return user;
    }

    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setCognitoIdentityId(String cognitoIdentityId) {
        this.cognitoIdentityId = cognitoIdentityId;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public void setCognitoAuthenticationType(String cognitoAuthenticationType) {
        this.cognitoAuthenticationType = cognitoAuthenticationType;
    }

    public void setCognitoAuthenticationProvider(String cognitoAuthenticationProvider) {
        this.cognitoAuthenticationProvider = cognitoAuthenticationProvider;
    }

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "cognitoIdentityPoolId='" + cognitoIdentityPoolId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", cognitoIdentityId='" + cognitoIdentityId + '\'' +
                ", caller='" + caller + '\'' +
                ", apiKey='" + "******" + '\'' +
                ", sourceIp='" + sourceIp + '\'' +
                ", cognitoAuthenticationType='" + cognitoAuthenticationType + '\'' +
                ", cognitoAuthenticationProvider='" + cognitoAuthenticationProvider + '\'' +
                ", userArn='" + userArn + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

}
