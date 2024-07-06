package com.example.SpringProfilesDemo.DAOConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JDBC {

    @Value("${Db.username}")
    private String username;

    @Value("${Db.password}")
    private String password;

    @PostConstruct
    public void init(){
        System.out.println("DB Username:"+ username +"| DB Password:"+ password);
    }

}
