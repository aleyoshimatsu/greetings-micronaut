package dev.alexandreyoshimatsu.resource;

import javax.inject.Inject;

import dev.alexandreyoshimatsu.domain.Greetings;
import dev.alexandreyoshimatsu.service.GreetingsService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller()
public class GreetingsController {

    private GreetingsService service;

    public GreetingsController(GreetingsService service) {
        this.service = service;
    }

    @Get("/greetings")
    public HttpResponse<Greetings> greetings() {
        return HttpResponse.ok(service.greetingMessage());
    }

    @Get("/greetings/{name}")
    public HttpResponse<Greetings> greetings(String name) {
        return HttpResponse.ok(service.greetingMessage(name));
    }
}
