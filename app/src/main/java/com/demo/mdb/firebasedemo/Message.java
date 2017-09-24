package com.demo.mdb.firebasedemo;

import java.io.Serializable;

/**
 * Created by hp on 2/17/2017.
 */

public class Message implements Serializable{
    String message;
    String firebaseImageUrl;

    public Message() { }

    public Message(String message, String firebaseImageUrl) {
        this.message = message;
        this.firebaseImageUrl = firebaseImageUrl;
    }

    public String getMessage() {
        return message;
    }

    public String getFirebaseImageUrl() {
        return firebaseImageUrl;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFirebaseImageUrl(String firebaseImageUrl) {
        this.firebaseImageUrl = firebaseImageUrl;
    }
}
