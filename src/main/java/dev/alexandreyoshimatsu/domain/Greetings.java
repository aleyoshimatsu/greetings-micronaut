package dev.alexandreyoshimatsu.domain;

public class Greetings {

    private String message;

    private Long timestamp;

    public Greetings() {

    }

    public Greetings(String message, Long timestamp) {
        super();
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}
