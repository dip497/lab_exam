package com.example.labexam;

public class data {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImamgeurl() {
        return imamgeurl;
    }

    public void setImamgeurl(String imamgeurl) {
        this.imamgeurl = imamgeurl;
    }

    String text;

    public data(String text, String imamgeurl) {
        this.text = text;
        this.imamgeurl = imamgeurl;
    }

    String imamgeurl;
}
