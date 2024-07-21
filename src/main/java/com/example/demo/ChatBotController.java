package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://www.grupoinhaut.com")
public class ChatBotController {

    @Autowired
    private MailService mailService;

    @PostMapping("/user-data")
    public void receiveUserData (@RequestBody UserModel user){
        mailService.sendEmail(user);
    }
}
