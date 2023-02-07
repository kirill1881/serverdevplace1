package com.example.serverdevplace.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.internet.MimeMessage;
import java.io.InputStream;

@Component
public class SendMail {
    @Autowired
    JavaMailSender mailSender;

    public void sendMail(String name, String number, String comment){
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper msg = null;
        try {
            String text = "Имя: " + name + "\n" + "Номер телефона" + number + "\n"
                    + "Коментарий " + comment;
            msg = new MimeMessageHelper(message, true);
            msg.setTo("devplaceleed@gmail.com");
            msg.setFrom("devplaceleed@gmail.com");
            msg.setSubject("Новая заявка с сайта");
            msg.setText(text);
            /*   msg.addAttachment("file", file);*/

            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
