package com.example.diplom_visit_card.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class LoggedPersonService {
    private String name;
    private String password;


    public boolean logged() {
        if(this.name == null)
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
