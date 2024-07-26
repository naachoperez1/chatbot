package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatBotController {

    @Autowired
    private MailService mailService;

    @CrossOrigin(origins = "*")
    @PostMapping("/user-data")
    public void receiveUserData (@RequestBody UserModel user){
        mailService.sendEmail(user);
    }
}
