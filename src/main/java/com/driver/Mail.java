package com.driver;

import java.util.Date;

public class Mail {
        Date date;
        String senderName;
        String message;
        public Mail(Date date, String sender, String message) {
            this.date = date;
            this.senderName = sender;
            this.message = message;
        }

    public Mail() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
