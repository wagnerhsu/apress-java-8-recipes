package org.java8recipes.chapter01.recipe1_02;

import java.util.Locale;

public class HelloMessage {
    private String message="";
    public HelloMessage() {
        this.message = "Default Message";
    }

    public void setMessage(String m) {
        this.message = m;
    }
    public String getMessage() {
        return this.message.toUpperCase(Locale.ROOT);
    }
}
