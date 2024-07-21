package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(UserModel userModel) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("naachoperez11@gmail.com");
        message.setSubject("Nuevo contacto del chatbot");
        message.setText("Comunicarse con: " + userModel.getNombre() + ",\n"
                + "Teléfono: " + userModel.getTelefono() + ",\n"
                + "Email: " + userModel.getMail() + ",\n"
                + "Comentarios adicionales: " +userModel.getComentarios());
        emailSender.send(message);
    }


}
