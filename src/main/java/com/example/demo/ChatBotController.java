package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatBotController {

    @Autowired
    private MailService mailService;

    @CrossOrigin(origins = "https://www.grupoinhaut.com")
    @PostMapping("/user-data")
    public ResponseEntity<String> receiveUserData (@RequestBody UserModel user){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Access-Control-Allow-Origin", "https://www.grupoinhaut.com");
        headers.add("Access-Control-Allow-Credentials", "true");
        headers.add("Vary", "Origin");

        mailService.sendEmail(user);

        return ResponseEntity.ok().headers(headers).body("Mensaje recibido");
    }
}
