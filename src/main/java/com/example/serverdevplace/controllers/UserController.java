package com.example.serverdevplace.controllers;


import com.example.serverdevplace.components.SendMail;
import com.example.serverdevplace.models.UserModel;
import com.example.serverdevplace.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class UserController {

    @Autowired
    SendMail sendMail;
    @Autowired
    UserRepo userRepo;
    @PostMapping
    public void add(@RequestParam String name,
                    @RequestParam String contact,
                    @RequestParam String comment){
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setNumber(contact);
        userModel.setComment(comment);
        userRepo.save(userModel);
        sendMail.sendMail(name, contact, comment);
    }

}
