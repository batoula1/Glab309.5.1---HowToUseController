package com.perscholas.TestController;

import com.perscholas.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @PostMapping("/users")
    public void  printData(@RequestBody User user){
        System.out.println("Printing the user data:" + user);
    }
}