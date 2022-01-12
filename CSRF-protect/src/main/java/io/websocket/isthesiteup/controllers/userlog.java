package io.websocket.isthesiteup.controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/send-money")
public class userlog {
    @GetMapping
    public String transferMoney() {
        return "main_page";
    }

    @PostMapping("/transfer")
    public String transfer() {
        return "success";
    }
}