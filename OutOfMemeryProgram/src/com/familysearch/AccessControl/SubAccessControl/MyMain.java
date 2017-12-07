package com.familysearch.AccessControl.SubAccessControl;

import com.familysearch.AccessControl.TopClass;

public class MyMain {

    public static void main(String[] args) {
        // public example
        TopClass topClass = new TopClass();
        System.out.println("Public modifier: " + topClass.publicString);
        System.out.println("By public method: " + topClass.getPublicString());

        // private example
        MyPrivateSubClass myPrivateSubClass = new MyPrivateSubClass();
        //System.out.println(myPrivateSubeClass.myPrivateSubString); // can't be accessed because it is private
        //System.out.println(topClass.privateString); // can't be accessed because it is private and outside of the package from this file
        //System.out.println(myPrivateSubClass.getMyPrivateString());
        //System.out.println("By public method: " + topClass.getPrivateString());

        // protected example
        MyProtectedSubClass myProtectedSubClass = new MyProtectedSubClass();
        System.out.println("Protected modified: " + myProtectedSubClass.myProtectedSubString);
        //System.out.println(topClass.protectedString); // can't be accessed because it is protected and outside of the package from this file
        //System.out.println("By protected method: " + topClass.getProtectedString());
        System.out.println("Protected from MyProtectedSubClass: " + myProtectedSubClass.getMyProtectedSubString());
    }
}
