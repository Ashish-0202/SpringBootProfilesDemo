package com.example.SpringProfilesDemo.Controller;

import com.example.SpringProfilesDemo.DAOConnection.JDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    JDBC jdbc;

}
