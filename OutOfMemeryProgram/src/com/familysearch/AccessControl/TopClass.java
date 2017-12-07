package com.familysearch.AccessControl;

public class TopClass {

    public String publicString = "I am public in TopClass.";
    private String privateString = "I am private in TopClass.";
    protected String protectedString = "I am protected in TopClass.";

    public String getPublicString() {
        return publicString;
    }

    private String getPrivateString() {
        return privateString;
    }

    protected String getProtectedString() {
        return protectedString;
    }

    class tryingToGetProtectedMethod {

    }
}
