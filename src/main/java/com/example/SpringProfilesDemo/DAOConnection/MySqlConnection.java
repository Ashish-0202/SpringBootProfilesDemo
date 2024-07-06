package com.example.SpringProfilesDemo.DAOConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySqlConnection {
    @Value("${Db.username}")
    private String username;

    @Value("${Db.password}")
    private String password;

    @PostConstruct
    public void init(){
        System.out.println("MySqlConnection Username:"+ username +"| DB Password:"+ password);
    }

}
