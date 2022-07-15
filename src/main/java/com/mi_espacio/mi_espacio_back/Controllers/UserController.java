package com.mi_espacio.mi_espacio_back.Controllers;

import com.mi_espacio.mi_espacio_back.Services.IEntity.IUserService;
import com.mi_espacio.mi_espacio_back.models.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.MapKey;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<Users> index(){
        return userService.findAll();
    }
}
