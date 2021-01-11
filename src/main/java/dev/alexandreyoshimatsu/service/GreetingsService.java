package dev.alexandreyoshimatsu.service;

import dev.alexandreyoshimatsu.domain.Greetings;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;
import java.util.Calendar;

@Singleton
public class GreetingsService {

    @Value("${greetings.message.default}")
    private String defaultMessage;

    public Greetings greetingMessage() {
        Long timestamp = Calendar.getInstance().getTimeInMillis();
        return new Greetings(this.defaultMessage, timestamp);
    }

    public Greetings greetingMessage(String name) {
        String message = "Hello, " + name + "!";
        Long timestamp = Calendar.getInstance().getTimeInMillis();
        return new Greetings(message, timestamp);
    }

}
